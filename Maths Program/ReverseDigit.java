import java.util.*;
class ReverseDigit
{
    public static void main(String args[])
    {
       System.out.println("Enter Number:");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println("Reverse of "+n+"="+reverse(n));
    }
   public static int  reverse(int n)
   {
      int rev=0;
      while(n!=0)
      {
         int digit=n%10;
         rev=rev*10+digit;
         n/=10;
      }
   return rev;
   }
}