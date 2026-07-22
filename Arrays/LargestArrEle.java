class LargestArrEle
{
    public static void main(String args[])
    {
        int arr[]={23,13,24,42,18};
        System.out.println("Largest Element in array:"+FindMax(arr,arr.length));
    }
    public static int FindMax(int arr[],int n)
    {
         if(n==0)
         {
            return arr[0];
         }
         return Math.max(arr[n-1],FindMax(arr,n-1));
    }
}