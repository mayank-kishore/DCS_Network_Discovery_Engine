progname="BasicThreadPoolExecutorExample"
progext=".java"
repeat=10
i=0
filename="out"
ext=".txt"
echo $progname$progext
javac $progname$progext

while [ $i -lt $repeat ]
do
	java $progname >> $filename"$i"$ext
	i=`expr $i + 1`
done
