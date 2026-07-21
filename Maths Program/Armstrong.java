import java.util.*;
class Armstrong
{
   public static void main(String args[])
   {
        System.out.println(CheckArmStrong(153));
   }
   public static boolean CheckArmStrong(int n)
   {
       int count=String.valueOf(n).length();
       int sum=0;
       int org=n;
       while(n>0)
       {
           int digit=n%10;
           sum+=Math.pow(digit,count);
           n/=10;
       }
     return org==sum;
   }
}