class Solution {
    private void Permute(int index, int[] nums, List < List < Integer >> ans) {
        if (index == nums.length) {
            List < Integer > ds = new ArrayList < > ();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            
            ans.add(new ArrayList < > (ds));
            return;
        }
        
        
        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            Permute(index + 1, nums, ans);
            swap(i, index, nums);
        }
    }
    
    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List < List < Integer >> a = new ArrayList < > ();
        Permute(0, nums, a);
        return a;
    }
}