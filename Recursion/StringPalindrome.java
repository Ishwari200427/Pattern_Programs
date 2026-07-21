class StringPalindrome
{
   public static void main(String args[])
   {
      String str="madamsir";
      System.out.println(checkPalindrome(0,str));
   }
   public static Boolean checkPalindrome(int i,String s)
   {
      if(i>s.length()/2) return true;
      if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;

      return checkPalindrome(i+1,s); 
   }
}