class MissingNumber2
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,6,7};
        System.out.println(findMissing(arr));
    }
   public static int  findMissing(int arr[])
   {
       int sum=0;
       for(int i=0;i<arr.length;i++)
       {
          sum+=arr[i];
       }
     int expectedSum =arr.length*(arr.length)+1/2;
     return (expectedSum-sum);
   }
}