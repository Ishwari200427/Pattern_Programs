/*
A
AB
ABC
ABCD
ABCDE 
*/
class Pattern15
{
   public static void main(String args[])
  {
	fun(5);
  }
 public static void fun(int n)
 {
     
     for(int i=1;i<=n;i++) 
	{
	 char ch='A';
	 for(char j=1;j<=i;j++)
	    {
               System.out.print(ch++);
	    }
	System.out.println();
	}
 }
}
