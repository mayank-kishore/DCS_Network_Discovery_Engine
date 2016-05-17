./test_ping.sh > out1.dat
cut -c-12 < out1.dat|sort -n| uniq > out2.dat
rm out1.dat
