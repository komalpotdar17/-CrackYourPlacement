import java.util.*;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;
        
        int left=0, right=0;
        
        Arrays.sort(g);
        Arrays.sort(s);
        
        while(left<m && right<n){
            if(g[right] <= s[left]){
                right += 1;
            }
             left += 1;
        }
        
       return right;
    }
}