class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty())
        {
            return 0;
        }
        
        
        int heystacklen = haystack.length();
        int needlelen = needle.length();
        
        for(int i=0;i<=heystacklen-needlelen;i++){
            if(haystack.substring(i, i+needlelen).equals(needle)){
                return i;
            }
        }
        
        return -1;
    }
}