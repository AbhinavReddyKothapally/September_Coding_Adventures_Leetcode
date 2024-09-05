class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m=rolls.length;
        int sum1=0,a,b;
        for(int i=0;i<m;i++)
        sum1+=rolls[i];
        int sum=((n+m)*mean)-sum1;
        System.out.println(sum);
        if((sum/n>6) || (sum/n<1) || ((sum/n)==6 && (sum%n>0)))
        return new int[0];
        else
        {
            b=sum/n;
            a=(sum%n);
        }
        int[] ans=new int[n];
        Arrays.fill(ans,b);
        int k=0;
        while(a-->0)
        {
            ans[k%n]++;
            k++;
        }

        return ans;
    }
}
