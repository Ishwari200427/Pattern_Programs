/*
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
A shift on s consists of moving the leftmost character of s to the rightmost position. For example, if s = "abcde", then it will be "bcdea" after one shift.
Example 1:
Input:
 s = "rotation", goal = "tionrota"
Output:
 true
*/

class Rotation_Of_Str_With_Another
{
   public static void main(String args[])
   {
      String s1="listen";
      System.out.println(isRotation2(s1,"stenli"));
   }
   public static boolean isRotation(String s,String goal)
   {
         if(s.length()!=goal.length())
         {
             return false;
         }
        for(int i=0;i<s.length();i++)
        {
           String rotate=s.substring(i)+s.substring(0,i);
           if(rotate.equals(goal))
           {
              return true;
           }
        }
    return false;
   }
 
  public static boolean isRotation2(String s,String goal)
 {       
     if(s.length()!=goal.length())
     {
       return false;
     }
    String doubled=s+s;
    return doubled.contains(goal);
 }
  
}
