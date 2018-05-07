

//Author:       Yinpeng Chen
//Question:     TwoSum
//Index:        No.1
//Date:         May-07-2018
//Complexity:	Time: O(logn)

import java.util.*;  



class twoSum{

    public static int[] twoSum(int[] provideArray, int targetNum)
    {
    	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    	
    	for (int i = 0; i < provideArray.length; i++) {
    		int subs = targetNum - provideArray[i];
    		
    		if(map.get(subs) != null) {
    			return new int[]{map.get(subs), i+1};
    		}else map.put(provideArray[i], i+1);
    	}
    	
    	return null;
    	
    }
    
    
    public static void main(String[] args)
    {
    	int[] test = {1,2,3,4};
    	int targetTest = 3;
    	int[] ans;
    	
    	ans = twoSum(test, targetTest);
    	
    	for(int k: ans) {
        	System.out.println(k);
    	}
    	
    }
}