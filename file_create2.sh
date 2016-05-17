s="10.8."
n=0
N=256
out_file="ip2.dat"
echo -n > $out_file
while [ $n -lt $N ]
do
	n1=0
	while [ $n1 -lt $N ]
	do
		echo -n $s >> $out_file
		echo  -n $n >> $out_file
		echo -n "." >> $out_file
		echo  -n $n1 >> $out_file
		echo -n " " >> $out_file
		n1=`expr $n1 + 1`
	done
	n=`expr $n + 1`
done
echo >> $out_file
