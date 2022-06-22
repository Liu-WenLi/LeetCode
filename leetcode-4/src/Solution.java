class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] arr = new int[len1 + len2];
        int f1 = 0;
        int f2 = 0;
        int  f = 0;
        double num = 0;
        while (f1 < len1 || f2 < len2){
            if (f1 >= len1){
                arr[f] = nums2[f2];
                f = f + 1;
                f2 = f2 + 1;
                continue;
            }
            if (f2 >= len2){
                arr[f] = nums1[f1];
                f = f + 1;
                f1 = f1 + 1;
                continue;
            }
            if (nums1[f1] <= nums2[f2]){
                arr[f] = nums1[f1];
                f = f + 1;
                f1 = f1 + 1;
            }
            else{
                arr[f] = nums2[f2];
                f = f + 1;
                f2 = f2 + 1;
            }
        }
        if ((len1+len2) % 2 == 0){
            num = ((double) arr[(len1+len2) / 2 - 1] + (double) arr[(len1+len2) / 2]) / 2;
        }
        else num = arr[(len1+len2) / 2];

        return num;
    }
}