class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next;
        ListNode cur = null;
        temp=temp.next;
        while(temp != null){
            if(temp.val != 0){
                cur = temp;
                temp = temp.next;
                while(temp != null && temp.val != 0){
                    cur.val += temp.val;
                    temp = temp.next;
                }
                cur.next = temp.next;
                temp = temp.next;
            }
        }
        return head;
    }
}
