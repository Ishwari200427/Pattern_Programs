import java.util.*;
class Longest_SubArr_With_Zero_Sum
{
   public static void main(String args[])
   {
      int arr[]={6, -2, 2, -8, 1, 7, 4, -10};
      System.out.println(FindSubArray(arr));
   }
   public static int FindSubArray(int arr[])
  {
    
     int longest=0;
     for(int i=0;i<arr.length;i++)
     {
         int sum=0;
        for(int j=0;j<arr.length;j++)
        {
            sum+=arr[j];
            if(sum==0)
            {
               longest=Math.max(longest,j-i+1);
            }
        }
     }
   return longest;
  }

}
