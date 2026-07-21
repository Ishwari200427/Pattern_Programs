import java.util.*;
class CountDigits
{
     public static void main(String args[])
     { 
	  System.out.println("Enter Number:");
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
         System.out.println("Total Digits in Number:"+n+"="+countDigit(n));
     }
    public static int countDigit(int n)
    {
	int count=0;
        while(n!=0)
        {
           int digit=n%10;
           n/=10;
           count++;
        }
       return count;
    }
}