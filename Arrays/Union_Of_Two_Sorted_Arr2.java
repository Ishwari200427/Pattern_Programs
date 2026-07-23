import java.util.*;
class Union_Of_Two_Sorted_Arr2
{
   public static void main(String args[])
   {
      int arr1[]={1,2,3,4,5};
      int arr2[]={3,4,5,6,7,8};
      union(arr1,arr2);
   }
  public static void union(int arr1[],int arr2[])
  {
      TreeSet<Integer>set=new TreeSet<>();
      for(int i=0;i<arr1.length;i++)
      {
         set.add(arr1[i]);
      }
     for(int i=0;i<arr2.length;i++)
     {
         set.add(arr2[i]);
     }
    for(int i:set)
    {
         System.out.print(i+" ");
    }
  }
}