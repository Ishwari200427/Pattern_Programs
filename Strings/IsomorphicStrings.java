/*
Given two strings s and t, determine if they are isomorphic. Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
Example 1
Input:
 s = "paper", t = "title"
Output:
 true
*/
import java.util.*;
class IsomorphicStrings
{
    public static void main(String args[])
   {
      String s1="add";
      String s2="egk";
      System.out.println(isIsomorphic2(s1,s2));
   }
   public static boolean isIsomorphic2(String s1,String s2)
   {
      int c1[]=new int[256];
      int c2[]=new int[256];
      if(s1.length()!=s2.length())
      {
         return false;
      }
      for(int i=0;i<s1.length();i++)
      {
          if(c1[s1.charAt(i)]!= c2[s2.charAt(i)])
          {
            return false;
          }
          c1[s1.charAt(i)]=i+1;
          c2[s2.charAt(i)]=i+1;
      }
    return true;
   }
  
   public static boolean isIsomorphic(String s1,String s2)
   {
       HashMap<Character,Character>map=new HashMap<>();
       HashSet<Character>isUsed=new HashSet<>();
       if(s1.length()!=s2.length())
       {
         return false;
       }
      for(int i=0;i<s1.length();i++)
      {
         char ch1=s1.charAt(i);
         char ch2=s2.charAt(i);

         if(map.containsKey(ch1))
         {
              if(map.get(ch1)!=ch2)
                   return false;
         }
         else 
        {
          if(isUsed.contains(ch2))
          {
            return false;
          }
        map.put(ch1,ch2);
        isUsed.add(ch2);
        }
      }
    return true;
   }
}