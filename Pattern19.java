/*
E
DE
CDE
BCDE
ABCDE
*/

class Pattern19
{
    public static void main(String args[])
    {
        fun(5);
    }
   public static void fun(int n)
   {
      
      for(int i=0;i<n;i++)
      {
	   char ch=(char)(65+n-1-i);
          for(int j=0;j<=i;j++)
           {
	       
               System.out.print(ch++);
           }
         System.out.println();
      }
   }
}
