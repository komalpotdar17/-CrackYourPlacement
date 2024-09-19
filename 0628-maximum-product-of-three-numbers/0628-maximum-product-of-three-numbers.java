public class Solution {
    public int maximumProduct(int[] nums) {
        // Initialize the three largest numbers to smallest possible value
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        // Initialize the two smallest numbers to the largest possible value
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        
        // Traverse the array once
        for (int num : nums) {
            // Update max1, max2, max3
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
            
            // Update min1, min2
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
        
        // Maximum of (max1 * max2 * max3) and (min1 * min2 * max1)
        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }
}
