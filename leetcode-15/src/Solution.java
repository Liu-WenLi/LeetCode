import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int tmp;
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++){
            if (! map.containsKey(nums[i]))
                map.put(nums[i], i);
        }
        for (int i = 0; i < len; i++){
            for (int j = i + 1; j < len; j++){
                tmp = -nums[i] - nums[j];
                if (map.containsKey(tmp)){
                    List<Integer> l = List.of(nums[i], nums[j], tmp);
                    if (!())
                    result.add(l);
                }
            }
        }
        return result;
    }
}