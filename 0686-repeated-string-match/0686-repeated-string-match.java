class Solution {
    public int repeatedStringMatch(String a, String b) {
        int minRepeats = (b.length() + a.length() - 1) / a.length();
        StringBuilder repeatedA = new StringBuilder();
        
        for (int i = 0; i < minRepeats; i++) {
            repeatedA.append(a);
        }
        
        if (repeatedA.indexOf(b) != -1) {
            return minRepeats;
        }
        
        repeatedA.append(a);
        if (repeatedA.indexOf(b) != -1) {
            return minRepeats + 1;
        }
        
        return -1;
    }
}