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
    public int pairSum(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int mx = 0;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode nxtNode = slow;
        ListNode prev = null;
        while(slow != null){
            nxtNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nxtNode;
        }
        while(prev != null){
            int csum = head.val + prev.val;
            mx = Math.max(mx,csum);
            head = head.next;
            prev = prev.next;
        }
        return mx;
    }
}