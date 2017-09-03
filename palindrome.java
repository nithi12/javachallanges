import java.util.scanner;
class palindrome
{
public static void main(String a[])
{
System.out.print("enter a number");
int palindrome=new Scanner(System.in).nextInt;
if(is palindrome(palindrome))
{
System.out.print("number"+palindrome+"is palindrome");
}
else
{
System.out.print("number"+"is not a palindrome");
}
}public static boolean is palindrome(int number)
{
int palindrome=number;
int reverse=0;
while(palindrome!=0)
{
int remainder=palindrome %10;
reverse=reverse*10+remainder;
palindrome=palindrome/10;
}
if(number==reverse)
{
return true;
}
return false;
}
