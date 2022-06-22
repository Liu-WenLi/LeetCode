class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0;
        int sum = 0;
        if (s.equals("")){
            return 0;
        }
        int len = s.length();
        max = 1;
        sum = 1;
        for (int i = 1; i < len; i++)
        {
            String s1 = s.substring(i, i+1);
            String s2 = s.substring(start, i);
            if (s2.contains(s1)){
                if (sum >= max)
                    max = sum;
                for (int j = start+1; j <= i-1; j++)
                {
                    String s3 = s.substring(j, i);
                    if (!s3.contains(s1)){
                        start = j;
                        break;
                    }
                }
                sum = s.substring(start, i+1).length();
            }
            else
            {
                sum = sum + 1;
                if (sum >= max)
                    max = sum;
            }

        }
        return max;
    }
}