import java.util.*;
class Rotate_Array_By_K_Position
{
    public static void main(String args[])
    {
        int arr[]={10,20,30,40,50};
        Rotate(0,2,arr);
        System.out.println(Arrays.toString(arr));
    }
    
  public static void Rotate(int start,int k,int arr[])
  {
        k = k % arr.length;

        Reverse(arr, 0, k - 1);
        Reverse(arr, k, arr.length - 1);
        Reverse(arr, 0, arr.length - 1);
      
       
  }
 public static void Reverse(int arr[],int start,int end)
{
    while(start<end)
    {
     int temp=arr[start];
     arr[start]=arr[end];
     arr[end]=temp;
     start++;
     end--;
    }
     
}

}