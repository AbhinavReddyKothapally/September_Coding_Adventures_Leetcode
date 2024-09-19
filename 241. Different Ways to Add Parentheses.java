class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        HashMap<String,List<Integer>> h=new HashMap<>();
        return helper(expression,h);
    }
    List<Integer> helper(String s,HashMap<String,List<Integer>> h){
        if(s.length()<3){
            List<Integer> res=new ArrayList<>();
            res.add(Integer.parseInt(s));
            return res;
        }
        if(h.get(s)!=null){
            return h.get(s);
        }
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*'){
                List<Integer> l=helper(s.substring(0,i),h);
                List<Integer> r=helper(s.substring(i+1),h);
                if(s.charAt(i)=='+'){
                for(int x:l){
                    for(int y:r){
                        res.add(x+y);
                    }
                }
                }
                else if(s.charAt(i)=='-'){
                for(int x:l){
                    for(int y:r){
                        res.add(x-y);
                    }
                }
                }
                else if(s.charAt(i)=='*'){
                for(int x:l){
                    for(int y:r){
                        res.add(x*y);
                    }
                }
                }
            }
        }
        h.put(s,res);
        return res;
    }
}
