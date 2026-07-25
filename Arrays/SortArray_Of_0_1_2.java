import java.util.*;
class SortArray_Of_0_1_2
{
     public static void main(String args[])
     {
         int arr[]={0,1,2,0,1,2};
         sortArray4(arr);
         System.out.println(Arrays.toString(arr));
     }
    public static int[] sortArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
             int j=i;
            while(j>0 && arr[j-1]>arr[j])
            {
               int temp=arr[j-1];
               arr[j-1]=arr[j];
               arr[j]=temp;
               j--;
            }
              
        }
     return arr;
    }
   public static int[] sortArray2(int arr[])
   {
      int count0=0,count1=0,count2=0,i=0;
      for(int j=0;j<arr.length;j++)
      {
          if(arr[j]==0) count0++;
          else if(arr[j]==1)count1++;
          else count2++;
      }
     while(count0-->0)
	{
	   arr[i]=0;
           i++;
	}
   while(count1-- >0)
      {
         arr[i]=1;
         i++;
      }
  while(count2-->0)
     {
         arr[i]=2;
     }
  return arr;
  }	
 public static int[] sortArray3(int arr[])
{
     int count0=0,count1=0,count2=0;
     for(int i=0;i<arr.length;i++)
     {
          if(arr[i]==0) count0++;
          else if(arr[i]==1) count1++;
          else count2++;
     }
   
    for(int i=0;i<count0;i++)
    {
      arr[i]=0;
    }
    
    for(int i=count0;i<count0+count1;i++)
    {
      arr[i]=1;
    }
   for(int i=count0+count1;i<arr.length;i++)
   {
       arr[i]=2;
   }

     return arr;
}
public static int[] sortArray4(int arr[])
{
    int low=0;
    int mid=0;
    int end=arr.length-1;
   
    while(mid<=end)
    {
        if(arr[mid]==0)
        {
           int temp=arr[low];
            arr[low]=arr[mid];
           arr[mid]=temp;
            low++;
            mid++;
        }
      else if(arr[mid]==1)
      {
       mid++;
      }
     else 
    {
        int temp=arr[end];
        arr[end]=arr[mid];
        arr[mid]=temp;
        end--;
    }
  }
 return arr;
}
}