class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int max = 0;
        int left = 0;
        int right = len - 1;
        int tmp;

        tmp = area(height[left], height[right], right - left);
        if (tmp > max)
            max = tmp;
        while (left < right){
            if (height[left] < height[right]){
                left += 1;
            }
            else {
                right -= 1;
            }
            tmp = area(height[left], height[right], right - left);
            if (tmp > max)
                max = tmp;
        }
        return max;
    }

    public int area(int a, int b, int l){
        int x = Math.min(a, b);
        return x * l;
    }
}