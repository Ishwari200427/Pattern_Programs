class MissingNumber
{
   public static void main(String args[])
   {
       int arr[]={7,1,2,5,3,4};
       System.out.println(findMissing(arr));

   }
  public static int findMissing(int arr[])
  {
     
     for(int i=1;i<arr.length+1;i++)
     {
        boolean present=false;
        for(int j=0;j<arr.length;j++)
        {
     	  if(arr[j]==i)
          {
             present=true;
             break;
          }
        }
      if(!present)
       {
          return i;
       }
   }    
  return -1;
  }
}