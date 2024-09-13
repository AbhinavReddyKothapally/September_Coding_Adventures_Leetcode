class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=arr.length;
        int[] pre=new int[n];
        int xor=0;
        for(int i=0;i<n;i++)
        {
            xor^=arr[i];
            pre[i]=xor;
        }
        int ans[]=new int[queries.length];
        for(int i=0;i<ans.length;i++)
        {
            int l=queries[i][0];
            int r=queries[i][1];
            ans[i]=pre[r]^pre[l]^arr[l];
        }
        return ans;
    }
}
