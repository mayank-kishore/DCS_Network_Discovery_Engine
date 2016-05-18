java BasicThreadPoolExecutorExample > out.txt
sed ':a;N;$!ba;s/-\n/ /g' out.txt > res.txt 
grep -v 100% < res.txt > fres.txt 
grep - < fres.txt > finalresult.txt
grep loss < finalresult.txt > f.txt
rm out.txt res.txt fres.txt finalresult.txt