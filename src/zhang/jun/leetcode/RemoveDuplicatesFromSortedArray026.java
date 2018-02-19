package zhang.jun.leetcode;

public class RemoveDuplicatesFromSortedArray026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {};
		System.out.println(removeDuplicates(nums));
	}
	
    public static int removeDuplicates(int[] nums) {
    	if(nums==null) {
    		return 0;
    	}
    	int insertPos=1;    	
    	for(int i=0;i<nums.length;i++){
    		for(int j=i+1;j<nums.length;j++){
    			if(nums[j]!=nums[i]){
    				nums[insertPos++] = nums[j];    				
    				i=j-1;
    				break;
    			}
    		}
    	}
    	return insertPos;
    }
}
