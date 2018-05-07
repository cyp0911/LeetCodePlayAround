//Author:       Yinpeng Chen
//Question:     singleNum
//Index:        No.7
//Date:         May-07-2018
//Complexity:	
//description:	

class singleNum{
	public static int single(int[] array)
	{
		int ans = 0;
		for(int n: array)
		{
			ans = ans ^ n;
		}
		return ans;
	}
	
	public static void main(String[] args)
    {
    	int[] test = {1,2,3,3,2};
    	int ans = single(test);
    
    	System.out.println(ans);

    	
    }
}
