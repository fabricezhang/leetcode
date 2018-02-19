package zhang.jun.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum001 {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        nums = TwoSum001.twoSum01(nums,13);
        System.out.println(nums[0] + " " + nums[1]);
    }

    public static int[] twoSum01(int[] nums, int target) {
        int i,j;
        int[] res = {0,0};
        for(i=0;i<nums.length-1;i++){
            for(j=i+1;j<nums.length;j++){
                if(target == nums[i] + nums[j]){
                  res[0] = i;
                  res[1] = j;
                }
            }
        }
        return res;
    }

    public int[] twoSum02(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}