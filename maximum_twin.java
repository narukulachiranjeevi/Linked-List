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
    ListNode back=null;
    int sum=0;
    void rec(ListNode head){
        if(head.next!=null) rec(head.next);
        sum=Math.max(sum,back.val+head.val);
        if(back!=null) back=back.next; 
    }
    public int pairSum(ListNode head) {
        back=head;
        rec(head);
        return sum;
    }
}
