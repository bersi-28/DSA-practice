class Solution {
    public boolean isPalindrome(String s) {
     StringBuilder filteredString = new StringBuilder(); 
     for (int i = 0; i < s.length(); i++) { 
        char c = s.charAt(i); if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
             if (c >= 'A' && c <= 'Z') {
                 c = (char)(c + 32); } 
                filteredString.append(c); 
                } 
                }
                 String original = filteredString.toString(); 
                 String reversed = new StringBuilder(original).reverse().toString();
                  return original.equals(reversed);  
    }
}