progname="Task"
progext=".java"
repeat=10
i=0
filename="out"
ext=".txt"
javac $progname+$progext
while [ $i -lt $repeat ]
do
	java $progname >> $filename+"$i"+$ext
	i=`expr $i+1`
done
