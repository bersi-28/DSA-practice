class Solution {
    public int strStr(String haystack, String needle) {
     int haystackLength = haystack.length(); 
     int needleLength = needle.length(); 
     if (needleLength == 0) 
     { return 0;
      } 
      for (int i = 0; i <= haystackLength - needleLength; i++) {
         boolean found = true;
          for (int j = 0; j < needleLength; j++)
           { if (haystack.charAt(i + j) != needle.charAt(j)) {
             found = false;
              break; 
              } } 
              if (found) { 
                return i;
                 } }
                  return -1;  
    }
}