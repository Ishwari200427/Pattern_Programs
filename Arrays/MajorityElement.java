import java.util.*;
class MajorityElement
{
    public static void main(String args[])
    {
         int arr[]={1,2,3,2,2,2,2};
         System.out.println(findMajor3(arr));
    }
    public static int findMajor(int arr[])
    {
        int major=0;
        for(int i=0;i<arr.length;i++)
        {
              int count=0;
              for(int j=i+1;j<arr.length;j++)
	 	{
                   if(arr[i]==arr[j])
                   {
                     count++;
                   }
		}
              major=Math.max(major,count);
             if(major>=arr.length/2)
             {
               return major;
             }
        }
    return -1;
    }
    public static int findMajor2(int arr[])
    {
        int major=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:arr)
        {
             map.put(i,map.getOrDefault(i,0)+1);
        }
       for(Map.Entry<Integer,Integer>entry:map.entrySet())
       {
	  if(entry.getValue()>=arr.length/2)
          {
              return entry.getKey();
          }
       }
     return -1;
    }
   public static int findMajor3(int arr[])
   {
      int count=0;
      int ele=0;
      for(int i=0;i<arr.length;i++)
      {
           
           if(count==0)
           {
             ele=arr[i];
             count=1;
           }
           else if(arr[i]==ele)
           {
             count++;
           }
           else
          {
            count--;
          }
        
      }
return ele; 
   }
   
}