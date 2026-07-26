import java.util.*;
class PrintArrSpiral
{
   public static void main(String args[])
   {
      int arr[][]={{ 1, 2, 3, 4 },{ 5, 6, 7, 8 },{ 9, 10, 11, 12 },{ 13, 14, 15, 16 }};
      ArrayList<Integer>list=new ArrayList<>();
      list=printSpiral(arr);
      for(int i:list)
      {
        System.out.print(i+" ");
      }
     
      
   }
  public static ArrayList<Integer> printSpiral(int arr[][])
 {
      int left=0,top=0;
      int right=arr[0].length-1;
      int bottom=arr.length-1;
      ArrayList<Integer>list=new ArrayList<>();
      while(left<right && top<bottom)
      {
          for(int i=left;i<=right;i++)
          {
       	      list.add(arr[top][i]);
          }
          top++;
         for(int i=top;i<=right;i++)
         {
            list.add(arr[i][right]);
         }
         right--;
        for(int i=right;i>=bottom;i++)
        {
          list.add(arr[bottom][i]);
        }
        bottom--;
        if(top<=bottom)
        {
          for(int i=bottom;i>=top;i--)
          {
           list.add(arr[i][left]);
         }
         left++;
        }
     }
  return list;
 }
}