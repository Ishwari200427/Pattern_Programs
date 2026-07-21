/*
A
BB
CCC
DDDD
EEEEE
*/
class Pattern17
{
    public static void main(String args[])
    {
        fun(5);
    }
    public static void fun(int n)
    {
	 char ch='A';
	for(int i=1;i<=n;i++)
        {
         
           for(int j=1;j<=i;j++)
	    {
	       System.out.print(ch);
	    }
           ch++;
          System.out.println();
        }
    }
}