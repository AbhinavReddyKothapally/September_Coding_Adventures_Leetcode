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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans=new int[m][n];
        for(int i=0;i<m;i++)
        Arrays.fill(ans[i],-1);
        int top=0,bottom=m-1,left=0,right=n-1;
        while(head!=null)
        {
            for(int i=left;head!=null && i<=right;i++)
            {
                ans[top][i]=head.val;
                head=head.next;
            }
            top++;
            for(int i=top;head!=null && i<=bottom;i++)
            {
                ans[i][right]=head.val;
                head=head.next;
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;head!=null && i>=left;i--)
                {
                ans[bottom][i]=head.val;
                head=head.next;
                }
            bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;head!=null && i>=top;i--)
            {
                ans[i][left]=head.val;
                head=head.next;
            }
            left++;
            }
        }
        return ans;
    }
}
