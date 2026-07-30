class Solution {
    public int minimumPushes(String word) {
        int count=0;
        int n=word.length();
        if(n<=8){
            count+=n;
        }
        else if(n<=16){
            count+=(((n-8)*2)+8);
        }
        else if(n<=24){
            count+=(((n-16)*3)+((8)*2)+8);
        }
        else {
            count+=(((n-24)*4)+((8)*3)+((8)*2)+8);
        }
        return count;
        
    }
}