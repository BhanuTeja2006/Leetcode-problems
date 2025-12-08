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
    public ListNode reverseList(ListNode head) {
        Stack<Integer> s = new Stack<>();
        while(head != null){
            s.push(head.val);
            head = head.next;
        } 
        ListNode d = new ListNode(99);
        ListNode res = d;
        while(!s.isEmpty()){
            ListNode ptr = new ListNode(s.pop());
            d.next = ptr;
            d = d.next;
        }
        return res.next;
    }
}