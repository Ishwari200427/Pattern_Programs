import java.util.*;
class TwoSum
{
    public static void main(String args[])
    {
       int arr[]={11,5,2,10,6};
       System.out.println(twoSum2(arr,8));
       
    }
    public static boolean twoSum(int arr[],int target)
    {
       for(int i=0;i<arr.length;i++)
       {
           int cur=target-arr[i];
           
           for(int j=i+1;j<arr.length;j++)
           {
             
              if(cur==arr[j])
              {
                 return true;
              }
           }
       }
    return false;
    }
  public static ArrayList<Integer> twoSum2(int arr[],int target)
    {
       ArrayList<Integer>res=new ArrayList<>();
       for(int i=0;i<arr.length;i++)
       {
           int cur=target-arr[i];
           
           for(int j=i+1;j<arr.length;j++)
           {
               if(cur==arr[j])
              {
                 res.add(arr[j]);
                 res.add(arr[i]);
              }
           }
       }
    return res;
    }
  public static int[] twoSum3(int arr[],int target)
  {
       
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<arr.length;i++)
       {
          int x=target-arr[i];
          if(map.containsKey(x))
          {
             return new int[]{arr[i],map.get(x)};
          }
         map.put(arr[i],i);
       }
     return null;
  }

}