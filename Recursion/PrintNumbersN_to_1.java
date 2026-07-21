class PrintNumbersN_to_1
{
   public static void main(String args[])
   {
      print(5,1);
   }
public static void print(int n,int cur)
{
    if(cur>n)
    {
        return ;
    }
   System.out.println(n);
   print(n-1,cur);
}
}