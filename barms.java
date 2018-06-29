import java.io.*;
import java.util.*;
class barms
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int s1=sc.nextInt();
int x,y;
int temp=s;
for(i=s;i<=s1;i++)
{
 x=s%10;
 y=y+(x*x*x);
 s=s/10;
 }
 if(temp==s)
 {
 System.out.print(s);
 }
 else
 {
 System.out.print("no");
 }
 }
 }
 
