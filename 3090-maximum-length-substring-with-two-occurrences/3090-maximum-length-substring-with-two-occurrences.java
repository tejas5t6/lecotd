class Solution {
    public int maximumLengthSubstring(String s) {
         HashMap<Character,Integer> map=new HashMap<>();
    int l=0;
    int r=0;
    int max_len=0;
    int k=2;
    while(r<s.length()){
        map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
        while(map.get(s.charAt(r))>k){
            map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)-1);
            if(map.get(s.charAt(l))==0) map.remove(s.charAt(l));
        l++;
        }
        max_len=Math.max(max_len,r-l+1);
        r++;
    }       
    return max_len;
    }
}