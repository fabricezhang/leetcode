package zhang.jun.leetcode;

public class MoveZeros283 {

	public static void main(String[] args) {
		int[] nums = {0, 1, 2, 3, 0, 4,2,0,0,0,0,2,2,2,2,3, 4, 7,0,0};
		moveZeroes(nums);
		
		// To display 
		for (int i = 0; i < nums.length;i++){
			System.out.print(nums[i] + " ");
		}

		// Solution 2
        nums = new int[]{0, 1, 2, 3, 0, 4,2,0,0,0,0,2,2,2,2,3, 4, 7,0,0};

        moveZeroes_2(nums);

        // To display
        for (int i = 0; i < nums.length;i++){
            System.out.print(nums[i] + " ");
        }
	}
	
	/**
	 * First time to solve leetcode problem and very happy to be accepted for the first try.
	 * the performance is not as good as other guys (only beats 16.31% of java submissions...)
	 * feel free contact me if you have any suggestion or problems	 *  
	 * @param nums
	 */
	public static void moveZeroes(int[] nums) {
		int l = nums.length;
		int x,y,z;
		int step=0; // steps shall be moved		
		for(x=0;x<l;x++){
			if(nums[x]==0){
				step++;				
				for(y=x+1;y<l;y++){		
					if(nums[y]==0){						
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
    // Add 0s after moving the numbers
		while((step--)!=0){
			nums[l-1-step]=0;
		}
	}

    /**
     * beats 66.41% of submissions
     * @param nums
     */
    public static void moveZeroes_2(int[] nums) {
        int insertPos = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[insertPos++]=nums[i];
            }
        }
        for(int i=0;i<nums.length-insertPos;i++){
            nums[insertPos+i] = 0;
        }
    }
}
