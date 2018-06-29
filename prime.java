import java.io.*;
import java.util.*;
class prime
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    int low=sc.nextInt();
    int high=sc.nextInt();
    int i;
    while(low<high)
    {
      boolean flag=false;
      for(i=2;i<=low/2;++i)
      {
        if(low%i==0)
        flag=true;
        break;
      }
      if(!flag)
      {
        System.out.print(low+" ");
        ++low;
      }
    }
  }
}
    
