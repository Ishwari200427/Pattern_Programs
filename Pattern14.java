/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/
class Pattern14
{
   public static void main(String args[])
  {
	fun(5);
  }
 public static void fun(int n)
 {
      int k=1;
     for(int i=1;i<=n;i++) 
	{
	 for(int j=0;j<i;j++)
	    {
               System.out.print(k+" ");
               k++;
	    }
	System.out.println();
	}
 }
}
