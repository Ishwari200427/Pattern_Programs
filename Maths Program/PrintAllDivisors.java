class PrintAllDivisors
{
   public static void main(String args[])
   {
       FindDivisors(12);
   }
   public static void FindDivisors(int n)
   {
       for(int i=1;i<=n;i++)
       {
           if(n%i==0)
           {
                System.out.println(i);
           }
       }
   }
}