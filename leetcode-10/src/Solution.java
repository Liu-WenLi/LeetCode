class Solution {
    public boolean isMatch(String s, String p) {
        boolean result;
        int l1 = s.length();
        int l2 = p.length();

        boolean [][] dp = new boolean[l1 + 1][l2 + 1];
        dp[0][0] = true;

        for (int i = 1; i < l1 + 1; i++)
            dp[i][0] = false;

        for (int i = 1; i < l2 + 1; i++){
            if (p.charAt(i - 1) == '*')
                dp[0][i] = dp[0][i - 2];
            else dp[0][i] = false;

        }

        for (int i = 1; i < l1 + 1; i++){
            for (int j = 1; j < l2 + 1; j++){
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.')
                    dp[i][j] = dp[i - 1][j -1];
                else if (p.charAt(j - 1) == '*'){
                    if (s.charAt(j - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.'){
                        dp[i][j] = dp[i -1][j] || dp[i][j -2];
                    }
                    else dp[i][j] = dp[i][j -2];
                }
                else dp[i][j] = false;
            }
        }
        return dp[l1][l2];
    }
}