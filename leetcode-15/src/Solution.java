import java.lang.reflect.Array;
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int tmp;

        List<List<Integer>> result = new ArrayList<>();

        int len = nums.length;

        Arrays.sort(nums);
        for (int first = 0; first < len; first++){
            if (first > 0 &&  nums[first]==nums[first - 1])
                continue;
            int third = len - 1;
            for (int second = first+1; second < len; second++){
                if(second > first + 1 && nums[second]==nums[second-1])
                    continue;
                while (second < third && nums[first] + nums[second] + nums[third] > 0){
                    third = third - 1;
                }

                if (second == third)
                    continue;

                if(nums[first] + nums[second] + nums[third] == 0){
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[first]);
                    l.add(nums[second]);
                    l.add(nums[third]);
                    result.add(l);
                }
            }
        }
        return result;
    }
}