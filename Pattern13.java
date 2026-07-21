/*
1       1
12    21
123  321
12344321   
*/
class Pattern13
{
    public static void main(String args[])
    {
       fun(11);
    }
    public static void fun(int n)
    {
          for(int i=1;i<=n;i++)
	   {
	       for(int j=1;j<=i;j++)
		{
		   System.out.print(j);
		}
	      for(int k=2*(n-i);k>0;k--)
	      {
                 System.out.print("#");
	      }
             for(int j=i;j>=1;j--)
	     {
                System.out.print(j);
	     }
            System.out.println();
		
	   }
    }
}