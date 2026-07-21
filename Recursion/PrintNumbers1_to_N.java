class PrintNumbers1_to_N
{
   public static void main(String args[])
   {
       
      print("Ishwari",0,5);
   }
public static void print(String name,int start, int n)
{
    if(start==n)
    {
       return;
    }
   System.out.println(name);
   print(name,start+1,n);
}
}