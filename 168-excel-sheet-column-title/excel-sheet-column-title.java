class Solution {
    public String convertToTitle(int columnNumber) {
       String result = "";
        while (columnNumber > 0) 
        { columnNumber--; 
         int remainder = columnNumber % 26; 
         result = (char) (remainder + 'A') + result; 
         columnNumber = columnNumber / 26; 
         } 
         return result; 
    }
}