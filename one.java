import java.io.*;
import java.util.*;
class one
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int sum=1,j=1;
for(int i=s;i>0;i--)
{
sum=sum*i;
}
System.out.print(sum);
}
}
