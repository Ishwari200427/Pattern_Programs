/*
1
12
123
1234
12345
*/
class Pattern4
{
    public static void main(String args[])
    {
	fun(5);
    }
   public static void fun(int n)
   {
       for(int i=0;i<n;i++)
       {
	  for(int j=1;j<=i+1;j++)
	      System.out.print(j);
          System.out.println();
       }
	
   }
}