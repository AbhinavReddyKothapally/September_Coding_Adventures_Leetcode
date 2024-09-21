class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> a=new ArrayList<>();
        for(int i=1;i<=n;i++)
        a.add(Integer.toString(i));
        Collections.sort(a);
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<a.size();i++)
        ans.add(Integer.parseInt(a.get(i)));
        return ans;
    }
}
