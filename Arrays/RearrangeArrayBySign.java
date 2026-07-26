import java.util.*;
class RearrangeArrayBySign
{
    public static void main(String args[])
    {
       
       int arr[]={1,2,-4,-5};
       RearrangeArray(arr);
       System.out.println(Arrays.toString(arr));
    }
   public static int[] RearrangeArray(int arr[])
  {
      int pos[]=new int[arr.length];
      int neg[]=new int[arr.length];
      int p=0;
      int n=0;
      for(int i=0;i<arr.length;i++)
      {
          if(arr[i]>=0)
          {
            pos[p++]=arr[i];
          }
         else
         {
           neg[n++]=arr[i];
         }
     }
     
     for(int i=0;i<arr.length/2;i++)
     {
         arr[i*2]=pos[i];
         arr[i*2+1]=neg[i];
     }
     return arr;
  }
  public static int[] RearrangeArray2(int arr[])
  {
      int pos=0;
      int neg=1;
      for(int i=0;i<arr.length;i++)
      {
          if(arr[i]>=0)
          {
              arr[pos+=2]=arr[i];
          }
          else
         {
         arr[neg+=2]=arr[i];
         }
      }
   return arr;
  }
}