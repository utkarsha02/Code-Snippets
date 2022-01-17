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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        int carry =0;
        int res = 0;
        ListNode resultlist = new ListNode(0);
        ListNode iterator = resultlist;
        ListNode p = l1;
        ListNode q = l2;
        
        while(p != null || q != null){
            if(p!=null){
                 sum = p.val + carry;
            }
            if(q!=null){
                 sum = q.val + carry;
            }
            if(p!=null && q!=null){
                sum = p.val + q.val + carry;
            }
            res = sum%10;
            carry = sum/10;
            iterator.next  =new ListNode(res);
            iterator = iterator.next;
            if(p!=null)
                p = p.next;
            if(q!=null)
                q = q.next; 
        }
        if(carry>0){
            iterator.next = new ListNode(carry);
        }
        
        return resultlist.next;
    }
}