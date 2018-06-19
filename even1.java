import java.io.*;
import java.util.*;
class even1
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int a[]=new int[s];
for(int i=0;i<s;i++)
{
 a[i]=sc.nextInt();
 if(a[i]%2==0)
 {
 System.out.print(a[i]);
 }
 else
 {
 System.out.print("no");
 }
 }
 }
 }
