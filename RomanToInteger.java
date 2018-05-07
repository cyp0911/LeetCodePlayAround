//Author:       Yinpeng Chen
//Question:     TwoSum
//Index:        No.4
//Date:         May-07-2018
//Complexity:	

import java.util.*;  

class RomanToInteger{
	public static int roman(String s)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int ans = 0;
		map.put('M', 1000);    
        map.put('D', 500);    
        map.put('C', 100);    
        map.put('L', 50);
        map.put('X', 10);    
        map.put('V', 5);
        map.put('I', 1);
		
		for (int i =0; i < s.length(); i++)
		{
			if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1)))
			{
				ans -= map.get(s.charAt(i));
			}else ans += map.get(s.charAt(i));
		}
		
		
		
		return ans;
	}
	
	public static void main(String[] args)
    {
    	String test = "CI";
    	int ans = 0;
    	
    	ans = roman(test);
    	
    	System.out.println(ans);

    	
    }
	
	
}