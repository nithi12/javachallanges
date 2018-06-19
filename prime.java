import java.io.*;
import java.util.*;
class prime
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    int s= sc.nextInt();
    int flag=0,m=s/2;
    if(s==0||s==1)
    {
      System.out.print("it's not a prime number");
    }
    else
    {
      for(int i=0;i<m;i++)
      {
        if(s%2==0)
        {
          System.out.print("not a prime no");
          flag=1;
          break;
        }
      }
      if(flag==0)
      {
        System.out.print("yes");
      }
    }
  }
}
