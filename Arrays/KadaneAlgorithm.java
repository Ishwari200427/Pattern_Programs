//Problem Statement: Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.
import java.util.*;
class KadaneAlgorithm
{
   public static void main(String args[])
   {
       int arr[]={-2, -3, -7, -2, -10, -4};
       System.out.println(findMaxSum2(arr));
   }
  public static int findMaxSum(int arr[])
  {
     int max=Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++)
      {
           int sum=0;
           for(int j=i;j<arr.length;j++)
           {
              sum+=arr[j];
              if(sum>max)
              {
              max=sum;
              }
           }
          
      }
    return max;
  }
 public static int findMaxSum2(int arr[])
 {
     int max=Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++)
     {
        int sum=0;
        sum+=arr[i];
        if(sum>max) 
        {
           max=sum;
        }
       if(sum<0)
       {
         sum=0;
       }
     }
  return max;
 }
}