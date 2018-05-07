//Author:       Yinpeng Chen
//Question:     Nim Game
//Index:        No.6
//Date:         May-07-2018
//Complexity:	
//description:	You can always win a Nim game if the number of stones nn in the pile is not divisible by 44.

class Nimgame{
	public static boolean nim(int n)
	{
		return (n % 4) != 0;
	}
	
	public static void main(String[] args)
    {
    	int test = 5;
    	Boolean ans = nim(test);
    
    	System.out.println(ans);

    	
    }
}