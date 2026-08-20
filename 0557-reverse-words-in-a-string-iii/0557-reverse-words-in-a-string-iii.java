class Solution {
    public String reverseWords(String s) {
        String []pairs=s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<pairs.length;i++){
            sb.append(new StringBuilder(pairs[i]).reverse());
            if(i!=pairs.length-1) sb.append(" ");
        }
        return sb.toString();
    }
}