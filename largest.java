import java.io.*;
import java.util.*;
class largest
{
public static void main(String args[])
{
int x,y,z;
System.out.println("entered three numbers")
Scanner scan=new Scanner(System.in);
x=scan.nextInt();
y=scan.nextInt();
z=scan.nextInt();
if(x>y&&x>z)
{System.out.println("x is largest");
}
else if(y>x&&y>z)
{
System.out.println("y is largest");
}
else
{
System.out.println("z is largest");
}
}
}
