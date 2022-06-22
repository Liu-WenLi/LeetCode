import java.util.HashMap;

public class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int len = s.length();
        for (int i = 0; i < len; i++){
            char a = s.charAt(i);
            if (map.containsKey(a)){
                left = Math.max(map.get(a), left);  // 获得left
            }
            map.put(a, i+1);
            if (right - left + 1 > max)
                max = right - left + 1;
            right = right + 1; // 获得right
        }
        return max;
    }
}
