class Solution {
    public int sum_of_digits(int num)
    {
        int sod=0;
        while(num!=0)
        {
            sod+=(num%10);
            num/=10;
        }
        return sod;
    }
    public int getLucky(String s, int k) {
        int sum=0,n=s.length();
        for(int i=0;i<n;i++)
        {
            sum+=sum_of_digits(s.charAt(i)-'a'+1);
        }
        k--;
        int ans=sum;
        for(int i=0;i<k;i++)
        {
            ans=sum_of_digits(ans);
        }
        return ans;
    }
}
