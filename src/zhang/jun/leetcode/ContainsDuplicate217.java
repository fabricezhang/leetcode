package zhang.jun.leetcode;

import java.util.Arrays;

// beats 99.39%!!! Nice
public class ContainsDuplicate217 {

	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4,5,6,7,8,9,11,1};
		System.out.print(containsDuplicate(nums));
	}
	
    public static boolean containsDuplicate(int[] nums) {
    	if(nums==null){
    		return false;
    	}
    	Arrays.sort(nums);
    	int len = nums.length;
    	int i;
    	for(i=1;i<len;i++){
    		if(nums[i]==nums[i-1]){
    			return true;
    		}
    	}    	
    	return false;        
    }

}
