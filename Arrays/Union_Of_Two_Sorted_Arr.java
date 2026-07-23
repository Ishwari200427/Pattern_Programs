import java.util.*;
class Union_Of_Two_Sorted_Arr
{
   public static void main(String args[])
   {
      int arr1[]={1,2,3,4,5,6};
      int arr2[]={3,4,7,8};
      ArrayList<Integer>list=union(arr1,arr2);
      for(int i:list)
      {
        System.out.print(i+" ");
      }
   }
  public static ArrayList<Integer> union(int arr1[],int arr2[])
  {
       TreeMap<Integer,Integer>map=new TreeMap<>();
        
       int n=arr1.length;
       int m=arr2.length;
       
      for(int i=0;i<n;i++)
      {
          map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
      }
     for(int j=0;j<m;j++)
     {
         map.put(arr2[j],map.getOrDefault(arr2[j],0)+1);
     }
     ArrayList<Integer>union=new ArrayList<>();
     for(int key:map.keySet())
     {
        union.add(key);
     }
   return union;
  }
}
