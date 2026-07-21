class Pattern18
{
   public static void main(String args[])
  {
       fun(5);
  }
  public static void fun(int n)
  {
       int k;
      for(int i=0;i<n;i++)
     {
          char ch='A';
          for(k=n-1;k>i;k--)
	  {
            System.out.print(" ");

          }
          for(int j=0;j<i;j++)
	  {
            System.out.print(ch++);
	  }
         for(int j=i+1;j>0;j--)
         {
              System.out.print(ch--);
         }
        System.out.println();
     }
  }
  
}