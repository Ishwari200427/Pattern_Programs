class Stock_Buy_Sell
{
   public static void main(String args[])
   {
      int stocks[]={7,1,5,3,6,4};
      System.out.println(maxProfit2(stocks));
   }
  public static int maxProfit(int stocks[])
 {
      int profit=0;
      int max=0;
      for(int i=0;i<stocks.length;i++)
      {
          for(int j=i+1;j<stocks.length;j++)
           {         
              profit=stocks[j]-stocks[i];
              max=Math.max(max,profit);
           }   
      }
    return max;
 }

public static int maxProfit2(int stocks[])
{
    int min=Integer.MAX_VALUE;
     int max=0;
     for(int i=0;i<stocks.length;i++)
     {
        if(stocks[i]<min)
        {
            min=stocks[i];
        }
       max=Math.max(max,stocks[i]-min);
     }
 return max;
}
}