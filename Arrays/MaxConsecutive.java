class MaxConsecutive
{
    public static void main(String args[])
    {
        int arr[]={1,1,0,1,1,1,0,1,1};
        System.out.println(MaxCon(arr));
    }
    public static int MaxCon(int arr[])
    {
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]==1)
           {
              count++;
           }
          max=Math.max(count,max);
          if(arr[i]==0)
          {
            count=0;
          }
  
        }
   return max;
    }
}