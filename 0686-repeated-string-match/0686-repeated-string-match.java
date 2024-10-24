class Solution {
    public int repeatedStringMatch(String a, String b) {
        int minRepeats = (b.length() + a.length() - 1) / a.length();
        
        String repeated = a.repeat(minRepeats);
        
        if (repeated.contains(b)) {
            return minRepeats;
        }
        
        repeated += a;
        
        if (repeated.contains(b)) {
            return minRepeats + 1;
        }
        
        return -1;

    }
}