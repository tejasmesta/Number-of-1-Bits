class Solution {
    static int setBits(int N) {
        // code here
        
        String s = Integer.toBinaryString(N)+"";
        
        int ans = 0;
        
        int n = s.length();
        
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
            {
                ans++;
            }
        }
        
        return ans;
    }
}
