imort java.util.scanner;
class checkevenodd
{
public static void main(String args[])
{
int num;
system.out.println("enter an integer");
Scanner input=new Scanner(System.in);
num=input.nextInt();
if(num%2==0)
{
System.out.println("entered number is even");
}
else if(num%2!=0)
{
System.out.println("entered numberis odd");
}
else
{
System.out.println("entered number is zero");
}
}
}
