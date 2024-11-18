/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) { 
    if (head == null || head.next == null) {
         return true; }
          ListNode slow = head;
           ListNode fast = head;
            ListNode prevSlow = null; 
            while (fast != null && fast.next != null) {
                 fast = fast.next.next; 
                 prevSlow = slow;
                  slow = slow.next; }
                   if (fast != null) {
                     slow = slow.next; }
                      prevSlow.next = null; 
                      ListNode secondHalf = reverseList(slow);
                       while (secondHalf != null) { 
                        if (head.val != secondHalf.val) {
                             return false; } 
                             head = head.next; 
                             secondHalf = secondHalf.next; }
                              return true; }
                               private ListNode reverseList(ListNode head) 
                               { ListNode prev = null;
                                while (head != null) {
                                     ListNode nextNode = head.next; 
                                     head.next = prev; prev = head; head = nextNode; 
                                     } 
                                     return prev;
    }
}