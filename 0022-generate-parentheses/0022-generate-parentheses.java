class Solution {
    public void generate(int n,int l,int u,String s,List<String>ans){
        if(u==n){
            ans.add(s);
            return;
        }
        if(l<n)generate(n,l+1,u,s+"(",ans);
        if(u<l) generate (n,l,u+1,s+")",ans);
    }
    public List<String> generateParenthesis(int n) {
        List <String> ans= new ArrayList<>();
        generate(n,0,0,"",ans);
        return ans;
        
        
    }
}