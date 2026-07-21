class CountHigh_Low_Frequency_Arr
{
   public static void main(String args[])
   {
       int arr[]={10,13,10,14,14,13,13,22,22,22,10,10,10};
       count(arr);
   }
   
    public static void count(int arr[])
{
      int maxCnt=0,minCount=arr.length;
      int maxEle=0,minEle=0;
      
      boolean visited[]=new boolean[arr.length];
      for(int i=0;i<arr.length;i++)
	{
	    int count=1;
            if(visited[i])
            {
              continue;
            }
           for(int j=i+1;j<arr.length;j++)
           {
              if(arr[i]==arr[j])
              {
                 visited[j]=true;
		 count++;
              }
             
           }
               if(count>maxCnt)
		{
	           maxCnt=count;
                   maxEle=arr[i];
		}
              if(count<minCount)
		{
		   minCount=count;
	           minEle=arr[i];
		}
 
	}
        System.out.println("min Frequency element:"+minEle+" Count:"+minCount);
        System.out.println("max Frequency element:"+maxEle+" Count:"+maxCnt);
      
     }

}