//Author:       Yinpeng Chen
//Question:     RemoveDuplicates
//Index:        No.3
//Date:         May-07-2018
//Complexity:	

class removeDuplicates {
    public static int removeDuplicate(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (i == 0 || nums[i] != nums[i - 1])
            {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
    
    public static void main(String[] args)
    {
    	int[] test = {1,1,2};
    	int ans;
    	
    	ans = removeDuplicate(test);
    	
    	for(int k = 0; k < ans; k++) {
        	System.out.println(k+1);
    	}
    	
    }
}