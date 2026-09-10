class Solution {
    private boolean ispair(char last,char ch){
        return (last=='(' && ch==')')||(last=='{' && ch=='}')||(last=='[' && ch==']');
    }
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty()){
                char last=st.peek();
                if(ispair(last,ch)){
                    st.pop();
                    continue;
                }
            }
            st.push(ch);
        }
        return st.isEmpty();
    }
}