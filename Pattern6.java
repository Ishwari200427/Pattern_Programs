/*
*****
*****
*****
*****
*****
*/
class Pattern6
{
    public static void main(String args[])
    {
	fun(5);
    }
   public static void fun(int n)
   {
       for(int i=1;i<=n;i++)
       {
	  for(int j=n;j>0;j--)
	      System.out.print("*");
          System.out.println();
       }
	
   }
}