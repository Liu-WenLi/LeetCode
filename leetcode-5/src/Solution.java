import java.util.HashMap;
import java.util.Locale;

class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        int max = 0;
        int l = s.length();
        int left;
        int right;
        for (int i = 0; i < l; i++){
            char c1 = s.charAt(i);
            for (int j =  end - start + 1; j < l; j++){
                char c2 = s.charAt(j);
                if (c1 == c2){
                    left = i;
                    right = j;
                    while (left < right){
                        if (s.charAt(left) != s.charAt(right))
                            break;
                        left += 1;
                        right -= 1;
                        if (left >= right){
                            if (j - i + 1> max){
                                max = j - i + 1;
                                start = i;
                                end = j + 1;
                            }
                        }
                    }
                }
            }
        }
        if (start == end)
            return s.substring(start, start + 1);
        return  s.substring(start, end);
    }
}