import java.util.*;
class RemoveDuplicates2
{
      public static void main(String args[])
      {
            int arr[]={12,12,23,23,24,25,26,26,27,27};
            arr=removeDup(arr);
           System.out.println(Arrays.toString(arr));

      }
     public static int[] removeDup(int arr[])
     {
       
       HashSet<Integer>set=new HashSet<>();
      
       int index=0;
       for(int i:arr)
       {
            if(!set.contains(i))
            {
              set.add(i); 
            }
       }
      int nums[]=new int[set.size()];
      for(int i:set)
       {
          nums[index++]=i;
       }
       
      return nums;   
     }
}