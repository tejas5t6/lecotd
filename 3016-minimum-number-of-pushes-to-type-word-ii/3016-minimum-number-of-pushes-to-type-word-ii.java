class Solution {
    public int minimumPushes(String word) {
        int freq[]=new int [26];
        for(char words:word.toCharArray()){
            freq[words-'a']++;
        }
        Arrays.sort(freq);
        int count=0;
        for(int i=0;i<freq.length;i++){
            if(i>=18){
            count+=freq[i];
            }
            else if(i>=10){
                count+=2*freq[i];
            }
            else if(i>=2) count+=3*freq[i];
            else count+=freq[i]*4;
        }
        return count;
    }
}