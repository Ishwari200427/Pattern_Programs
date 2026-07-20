class Pattern9_Reverse_Pyramid
{
    public static void main(String args[])
    {
	fun(11);
    }
   public static void fun(int n)
   {       for(int i=n;i>=1;i-=2)	{
		for(int j=i;j>1;j--)
		{
		   System.out.print(" "); 
		}
		for(int k=i;k<=n;k++)
		{
		   System.out.print("* ");
		}

	System.out.println();

	}	
   }
}