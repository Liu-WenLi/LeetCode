class Solution {
    public static void main(String[] args){
        int []A = new int[]{2, 2};
        int h = 2;
        System.out.println(minEatingSpeed(A, h));

    }
    public static int minEatingSpeed(int[] piles, int h) {
        int left = 0;
        int right = 3;

        while(left <= right){
            int hh = 0;
            int mid = left + (right - left) / 2;

            for (int pile : piles) {
                hh += Math.ceil((double)(pile) / mid);
            }
            if (hh > h){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return left;

    }
}