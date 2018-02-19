package zhang.jun.leetcode;

public class MaxConsecutiveOnes485 {
	public static void main(String[] args) {
		int[] nums = {0, 1, 1, 1, 0, 1,1,0,0,0,0,1,1,1,1,1, 1, 0,0,0,1};
		System.out.print((findMaxConsecutiveOnes(nums)));
		System.out.print((findMaxConsecutiveOnes_2(nums)));
		
	}

    public static int findMaxConsecutiveOnes(int[] nums) {
    	int i;
    	int sum = 0;
    	int max = 0;
    	for(i=0;i<nums.length;i++){
    		if(1==nums[i]){
    			sum++;    			
    		}else{    			
    			sum=0;
    		}
    		max= (max>sum? max:sum);
    	}
		return max;
    }

	public static int findMaxConsecutiveOnes_2(int[] nums) {
		int sum = 0;
		int max = 0;
		for(int n:nums){
			if(1==n){
				sum++;
			}else{
				sum=0;
			}
			max= (max>sum? max:sum);
		}
		return max;
	}
}
