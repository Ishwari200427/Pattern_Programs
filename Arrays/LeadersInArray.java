import java.util.*;
class LeadersInArray
{
    public static void main(String args[])
    {
         int arr[]={4,5,6,7, 1, 0,};
         
         System.out.println(leaders2(arr));
    }
   public static void leaders(int arr[])
   {
       
       for(int i=0;i<arr.length;i++)
       {
            boolean isLeader=true;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
                {
                    isLeader=false;
                    break;
                } 
            }
         if(isLeader)
         {
            System.out.print(arr[i]+" ");
        }
    }
 }
 public static ArrayList<Integer>leaders2(int arr[])
 {
      int leader=arr[arr.length-1];
      ArrayList<Integer>list=new ArrayList<>();
      list.add(arr[arr.length-1]);
      for(int i=arr.length-2;i>=0;i--)
      {
           
            if(arr[i]>=leader)
            { 
               list.add(arr[i]);
               leader=arr[i];
            }
      }
    Collections.reverse(list);
    return list;
 }
}