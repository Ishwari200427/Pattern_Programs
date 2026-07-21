/*
1
01
101
0101
10101
*/
class Pattern12
{
     public static void main(String args[])
     {
        fun(5);
     }
    public static void fun(int n)
    {
        for(int i=0;i<n;i++)
            {
                int k;
		if(i%2==0)
		    {
                        k=1;
		    }
		   else
		   {
			k=0;
		   }
		for(int j=0;j<=i;j++)
		{
		   System.out.print(k);
		   k=1-k;
		}
             System.out.println();
            }
      
    }
}