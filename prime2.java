import java.io.*;
import java.util.*;
class prime2
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int s1=sc.nextInt();
int m=s/2,i,j,flag=0,count=0;
for(j=s;j<=s1;j++)
{
for(i=2;i<m;i++)
{
if(s%i==0)
{
count++;
flag=1;
break;
}
}
}
if(flag=0)
{
System.out.print(s);
}
}
}
