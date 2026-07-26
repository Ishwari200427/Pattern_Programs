import java.util.*;
class Longest_SubArr_With_Ksum
{
   public static void main(String args[])
   {
      int arr[]={10, 5, 2, 7, 1, 9};
      System.out.println(FindSubArray(arr,15));
   }
   public static int FindSubArray(int arr[],int k)
  {
      int longest=0;
     for(int i=0;i<arr.length;i++)
     {
         
         int sum=0;
         for(int j=i;j<arr.length;j++)
         {
           sum+=arr[j];
           if(sum==k)
           {
              longest=Math.max(longest,j-i+1);
	   }
         }
     }
  return longest;
  }

}
