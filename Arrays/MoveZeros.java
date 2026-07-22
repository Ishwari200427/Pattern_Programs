import java.util.*;
class MoveZeros
{
   public static void main(String args[])
   {
       int arr[]={10,0,20,0,30,0,40};
       moveZeros(arr);
       System.out.println(Arrays.toString(arr));
   }
   public static int[] moveZeros(int arr[])
   {
     int j=0;
     for(int i=0;i<arr.length;i++)
     {
        if(arr[i]!=0)
        {
          arr[j]=arr[i];
          j++;
        }
     }
    while(j<arr.length)
    {
        arr[j]=0;
        j++;
    }
  return arr;
   }
}