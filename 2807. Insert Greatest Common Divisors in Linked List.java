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
    public int gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode prev=head;
        ListNode curr=prev.next;
        while(curr!=null)
        {
        ListNode newnode=new ListNode(gcd(prev.val,curr.val),curr);
        prev.next=newnode;
        prev=curr;
        curr=curr.next;
        }
        return head;
    }
}
