import java.io.*;
import java.util.*;
class caps
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String s1[]=s.split(" ");
String s2="";
String s3="";
String s4="";
for(int i=0;i<s1.length;i++)
{
s2=String.valueOf(s1[i].substring(0,1)).toUpperCase();
s3=String.valueOf(s1[i].substring(1,s1[i].length()));
s4=s4+s2+s3;
}
System.out.print(s4);
}
}
