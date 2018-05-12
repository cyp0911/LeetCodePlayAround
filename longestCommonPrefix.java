//Author:       Yinpeng Chen
//Question:     Nim Game
//Index:        No.8
//Date:         May-07-2018
//Complexity:	
//description:	


class longestCommonPrefix{
	
	public static String commom(String[] test)
	{
		if (test.length == 0) return "";
		String prefix = test[0];
		
		for (int i = 0; i < test.length; i++)
		{
			while(test[i].indexOf(prefix) != 0)
			{
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) return "";
			}
		}
		
		
		
		return prefix;
	}
	
	public static void main(String args[])
	{
		String[] test = {"asdf", "as", "asb", "askeke"};
		String prefix = "";
		
		prefix = commom(test);
		System.out.println(prefix);
	}
	
	
	
}