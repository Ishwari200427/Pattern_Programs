import java.util.*;
class Rotate_Left_By_One
{
   public static void main(String args[])
   {
      int arr[]={12,23,14,15};
      RotateLeft(arr);
      System.out.println(Arrays.toString(arr));
   }
   
  public static int[] RotateLeft(int arr[])
  {
       int temp=arr[0];
       for(int i=1;i<arr.length;i++)
       {
           arr[i-1]=arr[i];
       }
       arr[arr.length-1]=temp;
     return arr;
  }
}