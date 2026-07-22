class SecondLargest2
{
    public static void main(String args[])
    {
        int arr[]={23,41,24,42,18};
        System.out.println("Second Largest Element in array:"+SecondMax(arr));
    }
    public static int SecondMax(int arr[])
    {
            int max=Integer.MIN_VALUE;
            int second=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++)
            {
               if(arr[i]>max )
               {   
                  second=max;
                  max=arr[i];
	       }
               else if(arr[i]>second && arr[i]!=max)
               {
                 second=arr[i];
               }
            }
          return second;  
    }

}