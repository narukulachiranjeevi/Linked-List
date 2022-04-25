class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pt1 = head;
        while(pt1!=null && pt1.next!=null && pt1.next.val==pt1.val){
            int val = pt1.val;
            while(pt1!=null && val==pt1.val){
            pt1=pt1.next;
           }
        }
        if(pt1==null||pt1.next==null) return pt1;
        ListNode pt2 = pt1.next;
        head = pt1;
        while(pt2!=null){
            int val = pt2.val;
            if(pt2.next!=null && pt2.next.val==val){
                while(pt2!=null &&pt2.val==val) pt2=pt2.next;
                pt1.next=pt2;
            }
            else{
               pt2=pt2.next;pt1=pt1.next;
            }
        }
        return head;
    }
}
