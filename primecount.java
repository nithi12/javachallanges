import java.io.*;
import java.util.*;
class primecount
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int s1=sc.nextInt();
int count=0;
while(s<s1)
{
boolean flag=false;
for(int j=2;j<s/2;++j)
{

if(s%j==0)
{
flag=true;
break;
}
}
if(!flag)
{
count=count+1;
++s;
}
}
System.out.print(count);
}
}
