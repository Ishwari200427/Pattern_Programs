class InsertionSort
{
   public static void main(String args[])
   {
       int arr[]={34,23,14,22,67,89};
      System.out.println("Before Sort");
      for(int i:arr)
      {
      System.out.print(i +" ");
      }
      InsertionSort(arr);
      System.out.println("\nAfter Sort");
      for(int i:arr)
      {
      System.out.print(i +" ");
      }

   }
  public static int[] InsertionSort(int arr[])
 {
      int n=arr.length;
      for(int i=0;i<n;i++)
	{
            int j=i;
            while(j>0 && arr[j-1]>arr[j])
	    {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
	    }
	}
    return arr;
 }
}