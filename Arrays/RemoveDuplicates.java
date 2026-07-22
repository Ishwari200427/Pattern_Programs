import java.util.*;
class RemoveDuplicates
{
      public static void main(String args[])
      {
            int arr[]={12,12,23,23,24,25,26,26,27,27};
            arr=removeDup(arr);
           System.out.println(Arrays.toString(arr));

      }
     public static int[] removeDup(int arr[])
     {
         boolean visited[]=new boolean[arr.length];
         int k=0;
	 for(int i=0;i<arr.length;i++)
         {
            if(visited[i]==true)
            {
                continue;
            }
            arr[k]=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                  if(arr[i]==arr[j])
                  {
                     visited[j]=true;
                  }
	    }
           k++;
           
         }  
      return Arrays.copyOf(arr,k);   
     }
}