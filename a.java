import java.io.*;
import java.util.*;
class a
{
public static void main(String s[])
{
long n,p,r=1;
Scanner sc=new Scanner(System.in);
Syatem.out.println("enter the number");
n=sc.nextLong();
System.out.println("enterb the power");
p=sc.nextLong();
if(n>=0&&p==0)
{
r=1;
}else if(n==0&&p>=1)
{
r=0;
}
else
{
for(i=0;i<=p;i++)
{
r=r*n;
}
}System.out.println(n+"^"+p+"="+r)
}
}



