import java.io.*;
import java.util.*;
class arm
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int x,y;
int temp=n;
while(n>0)
{
x=n%10;
y=y+(x*x*x);
n=n/10;
}
if(temp==n)
{
System.out.print("yes");
}
else
{
System.out.print("no");
}
}
}
