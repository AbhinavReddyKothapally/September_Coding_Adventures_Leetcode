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
    public ListNode modifiedList(int[] nums, ListNode head) {
        int max=0;
        for(int i=0;i<nums.length;i++)
            max=Math.max(max,nums[i]);
        int[] count=new int[max+1];
        for(int i=0;i<nums.length;i++)
            count[nums[i]]++;
        while(head.val<=max && count[head.val]!=0)
            head=head.next;
        ListNode temp=head.next;
        ListNode prev=head;
        while(temp!=null)
        {
            if(temp.val<=max && count[temp.val]!=0)
            {
                prev.next=temp.next;
                temp=temp.next;
            }
            else
            {
            temp=temp.next;
            prev=prev.next;
            }
        }
        return head;
            
    }
}
