git clone https://github.com/wg/wrk.git
cd wrk
make
cp wrk /usr/local/bin
echo "install wrk, done!"
cd .. && rm -rf wrk