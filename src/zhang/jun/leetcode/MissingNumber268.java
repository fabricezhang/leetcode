package zhang.jun.leetcode;

public class MissingNumber268 {

	public static void main(String[] args) {
		int[] nums = {1,2};
		System.out.print(missingNumber(nums));
	}
	
	public static int missingNumber(int[] nums) {
		long sum_nums=0;
		long sum_real=0;	
		boolean hasZero=false;
		if(nums==null){
			return 0;
		}
		int len = nums.length;	
		for(int num:nums){
			if(num==0){
				hasZero = true;
			}
			sum_nums +=num;			
		}
		// 0 found
		if(hasZero){
			for(int i=1;i<=len;i++){
				sum_real += i;
			}
			return (sum_real==sum_nums)?len:(int)(sum_real-sum_nums);			
		// 0 not found
		} else{
			return 0;
		}		
	}

}
