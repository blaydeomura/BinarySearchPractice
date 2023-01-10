package for_BinarySearchPractice;
/**
 * Binary Search
 * @BlaydeOmura
 */
public class Main {
    /**
     * * 
     * @param nums: name of array of ints that is the parameter
     * @param target: value we are looking to find/place 
     * @return returns the index position of target or where target should be placed 
     */
	
	public static void main(String[] args) {
    	int[] nums = {1, 7, 19, 23, 76};
    	System.out.println(binarySearchInsert(nums, 30));

    	}
	
    public static int binarySearchInsert(int[] nums, int target) {
    	int low = 0;
    	int high = nums.length-1;
    	int mid;
    	
    	while (low <= high) {
    		mid = low + (high - low) / 2;
    		
    		if (nums[mid] < target)
    			low = mid + 1;
    		else if (nums[mid] > target)
    			high = mid - 1;
    		else
    			return mid;
    	}
    	return high + 1;
    	
    	
      
    }
    
}

