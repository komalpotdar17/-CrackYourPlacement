class Solution {
    public int romanToInt(String s) {
        int[] values = new int[128];
        
        values['I'] = 1;
        values['V'] = 5;
        values['X'] = 10;
        values['L'] = 50;
        values['C'] = 100;
        values['D'] = 500;
        values['M'] = 1000;
        
        int total=0;
        int pval=0;
        
        for(int i=s.length()-1;i>=0;i--){
            char currentChar = s.charAt(i);
            int currentVal = values[currentChar];
            
            if(currentVal < pval){
                total -= currentVal;
            }
            else{
                total += currentVal;
            }
            
            pval = currentVal;
        }
        
        return total;
    }
}