class Solution {
    public String longestCommonPrefix(String[] strs) {
      if(strs==null|| strs.length==0)  
      return "";
      Arrays.sort(strs);
      String first=strs[0];
      String last=strs[strs.length-1];
      int i;
      for(i=0; i<first.length() && i<last.length()&& first.charAt(i)==last.charAt(i); i++){

      }
 return first.substring(0, i);
    }}    
    
