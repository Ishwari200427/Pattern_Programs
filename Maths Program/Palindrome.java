class Palindrome
{
   public static void main(String args[])
  {
      System.out.println(CheckPalindrome(121));
  }
  public static Boolean CheckPalindrome(int n)
  {
      int org=n;
      int rev=0;
      while(n>0)
      {
         int digit=n%10;
         rev=rev*10+digit;
         n/=10;
      }
     if(rev==org)
     {
        return true;
     }
   return false;
  }
}