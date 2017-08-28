import java.util.Scanner;
class leapyear
{
public static void main(String arg[])
{
Scanner sc=new Scanner(Systrem.in);
System.out.println("entered any year");
int year=sc.nextInt();
boolean flag=false;
if(year%400==0)
{
flag=true;
}
else if(year%100==0)
{
flag=false;
}
else if(year%4==0)
{
flag=true;
}
else
{
flag=false;
}
if(flag)
{
System.out.println("year"+"is leap year");
}
else
{
System.out.println("year"+"is not a leap year);
}
}
}
