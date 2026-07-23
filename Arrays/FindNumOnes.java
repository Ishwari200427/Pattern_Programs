import java.util.*;
class FindNumOnes
{
     public static void main(String args[])
   {
      int arr1[]={1,1,3,2,3};
      System.out.println(FindNum3(arr1));
   }

//Approch 1
   public static int Findnum(int arr[])
   {
         int one=0;
         HashMap<Integer,Integer>m=new HashMap<>();
         for(int i:arr)
         {
           m.put(i,m.getOrDefault(i,0)+1);
         }
         
        for(Map.Entry<Integer,Integer>entry:m.entrySet())
        {
             if(entry.getValue()==1)
             {
               one=entry.getKey();
             }
        }  
    return one;     
   }

//Approch 2
 public static int FindNum2(int arr[])
 {
      int one=0;
      boolean visited[]=new boolean[arr.length];
      for(int i=0;i<arr.length;i++)
      {
          int count=1;
          if(visited[i])
          {
             continue;
          }
         
         for(int j=i+1;j<arr.length;j++)
         {
             if(arr[i]==arr[j])
             {
                count++;
                visited[j]=true;
             }
         }
        if(count==1)
        {
          return arr[i];
        }
      }
return -1;
 }

//Approch 3
public static int FindNum3(int arr[])
{
       int ans=0;
       for(int i:arr)
       {
          ans^=i;
       }
return ans;
}
}