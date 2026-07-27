/*
Check Strings are anagram or nots
Example 1:
Input: CAT, ACT
Output: true
Explanation: Since the count of every letter of both strings are equal.

*/
import java.util.*;
class Anagram
{
   public static void main(String args[])
   {
      String s1="listen";
      String s2="Listen";
      System.out.println(isAnagram3(s1,s2));
   }
  public static boolean isAnagram(String s1,String s2)
  {
     if(s1.length()!=s2.length())
     {
       return false;
     }
     s1=s1.toLowerCase();
     s2=s2.toLowerCase();

     char ch1[]=s1.toCharArray();
     char ch2[]=s2.toCharArray();
     
     Arrays.sort(ch1);
     Arrays.sort(ch2);
     
     return Arrays.equals(ch1,ch2);
  }
  public static boolean isAnagram2(String s1,String s2)
  {
     if(s1.length()!=s2.length())
     {
       return false;
     }
     char ch1[]=s1.toCharArray();
     char ch2[]=s2.toCharArray();
     
     Arrays.sort(ch1);
     Arrays.sort(ch2);
     
     for(int i=0;i<ch1.length;i++)
     {
         if(ch1[i]!=ch2[i])
         {
           return false;
         }
     }
   return true; 
  }
 public static boolean isAnagram3(String s1,String s2)
  {
     if(s1.length()!=s2.length())
     {
       return false;
     }
    s1=s1.toUpperCase();
    s2=s2.toUpperCase();
    int freq[]=new int[26];
    for(int i=0;i<s1.length();i++)
    {
       freq[s1.charAt(i)-'A']++;
    }
   for(int i=0;i<s2.length();i++)
   {
       freq[s2.charAt(i)-'A']--;
   }
   for(int i=0;i<freq.length;i++)
   {
         if(freq[i]!=0)
         {
           return false;
         }
   }
 return true;
  }
}