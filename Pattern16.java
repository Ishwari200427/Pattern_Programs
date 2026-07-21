/*
ABCDE
ABCD
ABC
AB
A
*/
class Pattern16
{
   public static void main(String args[])
   {
	fun(5);
   }
  public static void fun(int n)
  {
     for(int i=n;i>=0;i--)
     {
        char ch='A';
        for(int j=1;j<=i;j++)
	{
	  System.out.print(ch++);
	}
       System.out.println();

     }
  }
}