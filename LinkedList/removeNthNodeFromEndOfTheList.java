/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        // if(n==1) retur?
        int count = 0;
        ListNode temp = head;
        ListNode temp2 = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        if(count==1 && n>=1) return null;
        if(count == n) return head.next;
        for(int i=0; i<count-n-1; i++){
            temp2 = temp2.next;
        }
        if(n>1)
        temp2.next = temp2.next.next;
        else if(n==1) temp2.next = null;
        else if(n==0) return head;

        return head;
        
    }
}