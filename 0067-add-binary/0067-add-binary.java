class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        
        int carry = 0;
        
        int i = a.length()-1;
        
        int j = b.length()-1;
        
        
        while (i >= 0 || j >= 0 || carry != 0) {
            int bit1 = (i >= 0) ? a.charAt(i)- '0' : 0;
            int bit2 = (j >= 0) ? b.charAt(j)- '0' : 0;  
            
            
            int sum = bit1 + bit2 + carry;
            carry = sum / 2;  
            sb.append(sum % 2);  

           
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}