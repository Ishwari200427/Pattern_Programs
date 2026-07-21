/*
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*/
class Pattern20_HollowDiamond
{
      public static void main(String args[])
      {
           fun(5);
      }
     
      public static void fun(int n)
      {
         for(int i=n;i>0;i--)
         {
             for(int j=0;j<i;j++)
	      {
	         System.out.print("*");
	      }
              for(int j=n-i+1;j>1;j--)
              {
	         System.out.print("  ");
              }
             for(int j=0;j<i;j++)
             {
                 System.out.print("*");

             }
            System.out.println();
         }
      for(int i=1;i<=n;i++)
      {
         for(int j=0;j<i;j++)
         {
             System.out.print("*");
         }
         for(int j=n-i+1;j>1;j--)
              {
	         System.out.print("  ");
              }

        for(int j=0;j<i;j++)
         {
             System.out.print("*");
         }

        System.out.println();

      }
    }
      
}