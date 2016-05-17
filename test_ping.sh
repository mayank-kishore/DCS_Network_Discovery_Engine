ip_string=""
inp_file="ip1.dat"
if [ $$ -eq 1 ]
then
	inp_file=$1
fi
while read line
do
	ip_string="$ip_string $line"
done <$inp_file
fping -t10000 -c10 $ip_string								
