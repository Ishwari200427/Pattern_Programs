class BubbleSort
{
   public static void main(String args[])
   {
      int arr[]={34,23,14,22,67,89};
      System.out.println("Before Sort");
      for(int i:arr)
      {
      System.out.print(i +" ");
      }
      bubbleSort(arr);
      System.out.println("\nAfter Sort");
      for(int i:arr)
      {
      System.out.print(i +" ");
      }

   }
  public static int[] bubbleSort(int arr[])
  {
      int n=arr.length;
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<n-i-1;j++) /*here used j<n-i-1 because in bubble sort last element is sorted hence no need to compare it so suppose n=5 j<n-0-1=4 ,j<3,j<2 so it reduce the iteration*/
          {
             if(arr[j]>arr[j+1])
              {
                 int temp=arr[j+1];
	         arr[j+1]=arr[j];
                 arr[j]=temp;
              }
          }
       
      }
    return arr;
  }

}