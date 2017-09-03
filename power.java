import java.io.*;
import java.util.*;
class power
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
int pow=0,power=0,num=0;
System.out.print("enter number");
num=sc.nextInt();
System.out.print("enter power");
pow=sc.nextInt();
System.out.print(power(num,pow));
}
public static int power(int a,int b)
{
int power=1;
for(int c=0;c<b;c++)
power*=a;
return power;
}
}
