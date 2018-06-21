import java.io.*;
import java.util.*;
class repeat
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int a1[]=new int[n];
int i,j,k,count=0;
for(i=0;i<=n;i++)
{
a[i]=sc.nextInt();
}
for(j=0;j<a.length;j++)
{
for(k=0;k<a.length;k++)
{
if(a[j]==a[k])
{
a1[j]=a[k];
count=count+1;
}
}
}
if(count>1)
{
System.out.print(a1[j]);
}
}
}
