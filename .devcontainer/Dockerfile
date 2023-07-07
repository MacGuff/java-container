FROM mcr.microsoft.com/devcontainers/java:1-17-bullseye

ARG INSTALL_MAVEN="true"
ARG MAVEN_VERSION=""

ARG INSTALL_GRADLE="false"
ARG GRADLE_VERSION=""


RUN if [ "${INSTALL_MAVEN}" = "true" ]; then su vscode -c "umask 0002 && . /usr/local/sdkman/bin/sdkman-init.sh && sdk install maven \"${MAVEN_VERSION}\""; fi \
    && if [ "${INSTALL_GRADLE}" = "true" ]; then su vscode -c "umask 0002 && . /usr/local/sdkman/bin/sdkman-init.sh && sdk install gradle \"${GRADLE_VERSION}\""; fi

COPY scripts/settings.xml /home/vscode/.m2/
RUN chown -R vscode /home/vscode/.m2/

# [Optional] Uncomment this section to install additional OS packages.
RUN apt-get update && export DEBIAN_FRONTEND=noninteractive \
    && apt-get -y install --no-install-recommends build-essential libssl-dev python3 python3-pip python3-venv

RUN python3 -m pip install --upgrade pip \
    && pip3 config set global.index-url https://pypi.tuna.tsinghua.edu.cn/simple

# [Optional] Uncomment this line to install global node packages.
RUN su vscode -c ". ${NVM_DIR}/nvm.sh && nvm install node && \
npm config set registry https://registry.npmmirror.com" 2>&1
