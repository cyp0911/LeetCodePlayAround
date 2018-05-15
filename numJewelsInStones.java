//Author:       Yinpeng Chen
//Question:     JewelsInStones
//Index:        No.9
//Date:         May-07-2018
//Complexity:	Brute Force
//description:	


class numJewelsInStones {
    public static int numJewelsInStones(String J, String S) {
        int ans = 0;
        for (char s: S.toCharArray())
            for (char j: J.toCharArray())
                if (j == s) {
                    ans++;
                    break;
                }
        return ans;
    }
    
    public static void main(String[] args)
    {
    	String S = "aaaassseetegege";
    	String F = "age";
    	
    	int ans = numJewelsInStones(S,F);
    	
    	System.out.println(ans);
    	
    }
}

