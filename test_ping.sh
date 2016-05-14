ip_string=""
while read line
do
	ip_string="$ip_string $line"
done <ip.dat
fping -t10000 -c10 $ip_string
echo "Done"
