class Solution {
    
    public int longestConsecutive(int[] nums) {
        
        int n=nums.length;
        if(n==0) return 0;
        
        Arrays.sort(nums);
        int last_smaller = Integer.MIN_VALUE;
        int cnt=0;
        int longest=1;
        
        for(int i=0;i<n;i++){
            if(nums[i]-1==last_smaller){
              cnt+=1;
              last_smaller=nums[i];
            }else if(nums[i]!=last_smaller){
                last_smaller=nums[i];
                cnt=1;
            }
            longest=Math.max(longest,cnt);
        }
       return longest;
    }
}