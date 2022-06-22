class Solution2 {
    public String longestPalindrome(String s) {
    int start = 0;
    int end = 0;
    int len = s.length();
    int left;
    int right;
    int max = 1;
    char[] charArray = s.toCharArray();
    for (int i = 0; i < len - 1; i++){
        if (charArray[i] == charArray[i + 1]){
            left = i;
            right = i + 1;
            while (left >= 0 && right <= len - 1){
                if (charArray[left] != charArray[right])
                    break;
                left -= 1;
                right += 1;
            }
            if (right - left + 1 > max){
                max = right - left + 1;
                start = left + 1; // 上面循环多减了一个1，所以要多加一个1
                end = right;
            }
        }
        if (i - 1 >= 0 && i + 1 <= len - 1){
            if (charArray[i - 1] == charArray[i + 1]){
                left = i - 1;
                right = i + 1;
                while (left >= 0 && right <= len - 1){
                    if (charArray[left] != charArray[right])
                        break;
                    left -= 1;
                    right += 1;
                }
                if (right - left + 1 > max){
                    max = right - left + 1;
                    start = left + 1; // 上面循环多减了一个1，所以要多加一个1
                    end = right;
                }
            }
        }
    }
    if (start == end)
        return s.substring(start, start + 1);
    return s.substring(start, end);
    }

}