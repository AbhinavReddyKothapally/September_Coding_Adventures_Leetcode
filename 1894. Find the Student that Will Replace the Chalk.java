class Solution {
    public int bs(long[] prefix,int num,int n)
    {
        int low=0,high=n-1,answer=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(prefix[mid]<=num)
            {
                answer=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return answer;
    }
    public int chalkReplacer(int[] chalk, int k) {
        int n=chalk.length;
        if(n==1)
        return 0;
        long[] prefix=new long[n];
        prefix[0]=chalk[0];
        for(int i=1;i<n;i++)
        prefix[i]=prefix[i-1]+chalk[i];
        int ans=bs(prefix,k,n);
        int value=k;
        while(ans==n-1)
        {
            value-=prefix[ans];
            ans=bs(prefix,value,n);
        }
        return ans+1;
    }
}
