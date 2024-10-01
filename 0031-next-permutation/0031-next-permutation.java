class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 1; 
        while(i - 1 >= 0 && nums[i-1] >= nums[i]) i--; 
        if(i - 1 >= 0) {
            int j = nums.length - 1;               
            while(nums[i-1] >= nums[j]) j--;          
            swap(nums, i-1, j); 
        }
        Arrays.sort(nums, i, nums.length);         
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}