class SelectionSort
{
    public static void main(String args[])
   {
      int arr[]={34,23,14,22,67,89};
      System.out.println("Before Sort");
      for(int i:arr)
      {
      System.out.print(i +" ");
      }
      selectionSort(arr);
      System.out.println("\nAfter Sort");
      for(int i:arr)
      {
      System.out.print(i +" ");
      }
   }
  public static int[] selectionSort(int arr[])
  {
      int n=arr.length;
      for(int i=0;i<n;i++)
      {
         for(int j=i+1;j<n;j++)
	 {
             int min=i;
              if(arr[min]>arr[j])
	      {
		 min=j;
	      }
	     int temp=arr[i];
             arr[i]=arr[min];
             arr[min]=temp;
	 }
      }
    return arr;
  }
}