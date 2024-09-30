class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> ans = new ArrayList<>();
        
        for (int row = 0; row < numRows; row++) {
            List<Integer> ansRow = new ArrayList<>();
            ansRow.add(1);  
            
            long ansValue = 1;  
            for (int col = 1; col <= row; col++) {
                ansValue = ansValue * (row - col + 1) / col;  
                ansRow.add((int) ansValue);  
            }
            
            ans.add(ansRow);  
        }
        
        return ans;
    }
}