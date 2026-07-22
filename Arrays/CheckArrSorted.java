class CheckArrSorted
{
      public static void main(String args[])
      {
            int arr[]={12,2,24,25,26};
            System.out.println(isSorted(arr));
      }
     public static boolean isSorted(int arr[])
     {
        for(int i=0;i<arr.length;i++)
        {
             for(int j=i+1;j<arr.length;j++)
	     {
                  if(arr[i]>arr[j])
                  {
                        return false;
                  }
	     }
        }     
     return true;   
     }
}