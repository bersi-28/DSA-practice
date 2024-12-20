class Solution {
    public List<String> summaryRanges(int[] nums) {
     List<String> ranges = new ArrayList<>(); 
     if (nums.length == 0) {
         return ranges; }
          int start = nums[0];
           for (int i = 1; i < nums.length; i++) {
             if (nums[i] != nums[i - 1] + 1) { 
                addRange(ranges, start, nums[i - 1]);
                 start = nums[i];
                  } } 
                  addRange(ranges, start, nums[nums.length - 1]);
                   return ranges; } 
        private void addRange(List<String> ranges, int start, int end) {
             if (start == end) {
                 ranges.add(String.valueOf(start)); }
                  else {
                     ranges.add(start + "->" +  end); 
    }
}}