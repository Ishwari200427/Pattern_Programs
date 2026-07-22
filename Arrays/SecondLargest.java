class SecondLargest
{
    public static void main(String args[])
    {
        int arr[]={23,13,24,42,18};
        System.out.println("Second Largest Element in array:"+SecondMax(arr));
    }
    public static int SecondMax(int arr[])
    {
            int n=arr.length;
           for(int i=0;i<n;i++)
           {
                for(int j=1;j<n-1;j++)
                {
                    if(arr[j]>arr[j+1])
		    {
                       int temp=arr[j];
                       arr[j]=arr[j+1];
                       arr[j+1]=temp;
		    }
		}
	   }
       return arr[n-2];
    }

}