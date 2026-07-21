class PrintNumbers1_to_N
{
   public static void main(String args[])
   {
      print(1,5);
   }
public static void print(int cur,int n)
{
    if(cur>n)
    {
        return ;
    }
   System.out.println(cur);
   print(cur+1,n);

}
}