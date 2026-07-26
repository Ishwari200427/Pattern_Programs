import java.util.*;
class LongestConsecutive
{
   public static void main(String args[])
   {
         int arr[]={0,1,4,3,2,8,10,15,13,14,12,11};
         System.out.println(findLongestCons2(arr));
   }
  public static int findLongestCons(int arr[])
  {
      Arrays.sort(arr);
      int count=1;
      int max=1;
      for(int i=1;i<arr.length;i++)
      {
           if(arr[i]==arr[i-1])
            {
             continue;
            }
           if(arr[i]==arr[i-1]+1)
           {
               count++;
           }
          else
          {
             count=1;
          }
       max=Math.max(count,max);
      }
     return max;
  }
public static int findLongestCons2(int arr[])
{
   int count=1;
   int max=1;
   TreeSet<Integer>set=new TreeSet<>();
   for(int i:arr)
   {
     set.add(i);
   }
   
    for(int i:set)
    {
     if(!set.contains(i-1))
     {
        count=1;
        int x=i;
     }
   if(set.contains(i+1))
   {
       count++;
       max=Math.max(count,max);
   }
  
  }
return max;
}

}

