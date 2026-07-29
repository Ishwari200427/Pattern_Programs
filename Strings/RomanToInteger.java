/*
  Example 1:
Input:
 s = "LVIII"
Output:
 58
Explanation:
 L = 50, V= 5, III = 3.
*/
import java.util.*;
class RomanToInteger
{
    public static void main(String args[])
    {
       System.out.println(RomanToInt("MCMXCIV"));
    }
    public static int RomanToInt(String s)
    {
        Map<Character,Integer>map=new HashMap<>();
      map.put('I',1);
      map.put('V',5);
      map.put('X',10);
      map.put('L',50);
      map.put('C',100);
      map.put('D',500);
      map.put('M',1000);
      
      int sum=0;
      for(int i=0;i<s.length()-1;i++)
      {
          if(map.get(s.charAt(i))>map.get(s.charAt(i+1)))
          {
              sum+=map.get(s.charAt(i));
          }
          else
          {
            sum-=map.get(s.charAt(i));
          }
      }
      return sum+map.get(s.charAt(s.length()-1));
    }
}

