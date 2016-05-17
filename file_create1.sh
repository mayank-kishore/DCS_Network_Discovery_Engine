s="10.8.13."
n=0
N=256
out_file="ip1.dat"
echo -n > $out_file
while [ $n -lt $N ]
do
		echo -n $s >> $out_file
		echo  -n $n >> $out_file
		echo -n " " >> $out_file
		n=`expr $n + 1`
done
echo >> $out_file
