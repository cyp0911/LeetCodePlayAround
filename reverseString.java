//Author:       Yinpeng Chen
//Question:     reverseString
//Index:        No.5
//Date:         May-07-2018
//Complexity:	


class reverseString{
	public static String reverse(String s)
	{
		char[] c = s.toCharArray();
		int left = 0;
		int right = c.length - 1;
		
		while(left < right)
		{
			swap(c, left++, right--);
		}
		
		
		return new String(c);
	}
	
	public static void swap(char[] c, int left, int right)
	{
		char temp = c[left];
		c[left] = c[right];
		c[right] = temp;	
	}
	
	
	public static void main(String[] args)
    {
    	String test = "CIVIK";
    	String ans = reverse(test);
    	System.out.println(ans);

    	
    }
	
	
}