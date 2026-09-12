class Solution {
    public int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer>arr=new ArrayList<>();
        int arrr[]=new int[10];
        for(int digit:digits) arrr[digit]++;
        for(int i=1;i<10;i++){
            for(int j=0;j<10;j++){
                for(int k=0;k<9;k+=2){
                    arrr[i]--;
                    arrr[j]--;
                    arrr[k]--;
                   if(arrr[i]>=0 && arrr[j]>=0 && arrr[k]>=0) arr.add(i*100+j*10+k);
                    arrr[i]++;
                    arrr[j]++;
                    arrr[k]++;
                }
            }
        }
        int []ne_sum=new int[arr.size()];
        for(int i=0;i<arr.size();i++) ne_sum[i]=arr.get(i);
        return ne_sum;
    }
}