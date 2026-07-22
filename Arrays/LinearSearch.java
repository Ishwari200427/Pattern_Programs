class LinearSearch
{
    public static void main(String args[])
    {
        int arr[]={23,44,67,34,29,29};
        System.out.println(LinearSearch(arr,29));
    }
   public static int LinearSearch(int arr[],int ele)
   {
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]==ele)
           {
              return i;
           }
        }
     return -1;
   }
}