package zhang.jun.leetcode;

public class RemoveElements027 {
	public static void main(String[] args) {
		int[] nums = {0, 1, 2, 3, 0, 4, 2, 0, 0, 0, 0, 2, 2, 2, 2, 3, 4, 7, 0, 0};
		int length = removeElement(nums,2);
		
		// To display 
		for (int i = 0; i < length;i++){
			System.out.print(nums[i] + " ");
		}
	}
	
	/**
	 * Beats 19.2%....
	 * @param nums
	 * @param val
	 * @return length
	 */
    public static int removeElement(int[] nums, int val) {
    	int l = nums.length;
    	int x,y,z;
    	int step = 0;
    	for(x=0;x<l;x++){
    		if(nums[x]==val){
    			step++;
    			for(y=x+1;y<l;y++){
    				if(nums[y]==val){
    					for(z=x-step+1;z<y-step;z++){
    						nums[z]=nums[z+step];
    					}
    					break;
    				}
    			}
				// Meaning that no more 0 after x
				if(y==l){
					for(z=x-step+1;z<y-step;z++){				
						nums[z]=nums[z+step];
					}
				}
    		}
    	}    	
		return l-step;        
    }
}
