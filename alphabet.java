import java.io.*;
import java.util.*;
class alphabet
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
char r=sc.nextChar();
if((r>=='a'&&r<='z')||(r='A'&&r='Z'))
{
System.out.println("the number is alphabet");
}
else
{
System.out.println("the number is not a alphabet");
}
}
}
