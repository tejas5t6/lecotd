class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int l=0;
        int r=0;
        int one=0;
        int n=s.length();
        String res="";
        while(r<n){
            if(s.charAt(r)=='1')one++;
            while(one>k){
                if(s.charAt(l)=='1')one--;
                l++;
            }
            if(one==k){
                while(s.charAt(l)=='0')l++;                      
                String ans =s.substring(l,r+1);    
            if((res.length()==ans.length() && ans.compareTo(res)<0)||res.length()>ans.length()||res.isEmpty()) res=ans;
            }
            r++;
        }
        return res;
    }
}