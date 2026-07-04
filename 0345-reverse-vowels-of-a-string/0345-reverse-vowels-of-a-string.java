class Solution {
    public boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') return true;
        return false;
    }
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char[] chh=s.toCharArray();
        while(i<j){
        
        
        if(isVowel(chh[i])){
            if(isVowel(chh[j])){
                char temp=chh[i];
                chh[i]=chh[j];
                chh[j]=temp;
                i++;
                j--;
            }
            else j--;
        }
        else i++;
    }
    
String str = new String(chh);
return str;
}
}