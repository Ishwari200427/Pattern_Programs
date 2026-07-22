class LargestArrEle2
{
    public static void main(String args[])
    {
        int arr[]={23,13,24,42,18};
        System.out.println("Largest Element in array:"+FindMax(arr));
    }
    public static int FindMax(int arr[])
    {
         int max=0;
         for(int i=0;i<arr.length;i++)
         {
              if(arr[i]>max)
              {
                 max=arr[i];
	      }
         }
      return max;
    }
}