class Fibonacci
{
   public static void main(String args[])
   {
       int n=5;
       for(int i=0;i<n;i++)
       {
	 System.out.println(fib(i));
       }
       
   }
  public static int fib(int n)
  {
       int fib=1;
       if(n<=1)
       {
         return n;
       }
      
     return fib(n-1)+fib(n-2);
  }
}