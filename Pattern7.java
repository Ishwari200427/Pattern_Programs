class Pattern7
{
    public static void main(String args[])
    {
	fun(9);
    }
   public static void fun(int n)
   {
       for(int i=n;i>=1;i-=2)
	{
		for(int j=n;j>=i;j--)
		{
		   System.out.print("*");
		}
	System.out.println();

	}	
   }
}