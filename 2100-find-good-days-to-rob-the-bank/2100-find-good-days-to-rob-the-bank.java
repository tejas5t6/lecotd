class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int n=security.length;
        int cnt=0;
        int prefix[]=new int[n];
        int suffix[]=new int[n];
        prefix[0]=0;
        for(int i=1;i<n;i++){
            if(security[i]<=security[i-1])cnt++;
            else cnt=0;
             prefix[i]=cnt;
        }
        suffix[n-1]=0;
        cnt=0;
        for(int i=n-2;i>=0;i--){
            if(security[i]<=security[i+1]) cnt++;
            else cnt=0;
            suffix[i]=cnt;
        }
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(prefix[i]>=time && suffix[i]>=time) arr.add(i);
        }
        return arr;
    }
}