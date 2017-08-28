import java.io.*;
import java.util.*;
class vowel
{
public static void main(String arg[])
{
Scanner ch=new Scanner(System.in);
char a=ch.nextChar();
if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
{
System.out.println("the number is vowel");
}
else
{
System.out.println("the number is consonent");
}
}
}
