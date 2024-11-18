class Solution {
    public String addBinary(String a, String b) {
    String result = ""; 
    int i = a.length() - 1; 
    int j = b.length() - 1; 
    int carry = 0;
     while (i >= 0 || j >= 0 || carry == 1) {
         int sum = carry; 
         if (i >= 0) { 
            sum += a.charAt(i--) - '0'; 
            } if (j >= 0) {
                 sum += b.charAt(j--) - '0'; 
            }
             result = (sum % 2) + result;
              carry = sum / 2; 
              } 
              return result;
}}