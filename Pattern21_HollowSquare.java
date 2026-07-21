/*
*****
*   *
*   *
*   *
*****
*/
class Pattern21_HollowSquare
{
   public static void main(String args[])
   {
      fun(5);
   }
  public static void fun(int n)
  {
      for(int i=0;i<n;i++)
      {
          if(i==0 || i==n-1)
          {
             for(int j=0;j<n;j++)
             {
               System.out.print("*");
             }
          }
          else
          {
              for(int j=0;j<1;j++)
              {
                  System.out.print("*");
              }
              for(int j=0;j<n-2;j++)
              {
                 System.out.print(" ");
              }
              for(int j=0;j<1;j++)
              {
                  System.out.print("*");
              }

          }
          
         System.out.println();
      }
  }
}