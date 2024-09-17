class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
     HashMap<String,Integer> map=new HashMap<>();
     String[] str1=s1.split(" ");
     String[] str2=s2.split(" ");
     for(int i=0;i<str1.length;i++)
     map.put(str1[i],map.getOrDefault(str1[i],0)+1);
     for(int i=0;i<str2.length;i++)
     map.put(str2[i],map.getOrDefault(str2[i],0)+1);  
     List<String> str=new ArrayList<>();
     for(String s:map.keySet())
     {
        if(map.get(s)==1)
        str.add(s);
     }
     String[] ans=new String[str.size()];
     for(int i=0;i<str.size();i++)
     ans[i]=str.get(i);
     return ans;
    }
}
