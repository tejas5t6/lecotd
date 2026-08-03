class Solution {
    public int[] plusOne(int[] digits) {
        int j=digits.length;
        int diigit[]=new int [j+1];
        diigit[0]=1;
        int i=j-1;
        while(i>=0){
            if(digits[i]!=9){
                digits[i]=digits[i]+1;
                return digits;
            }
            digits[i]=0;
            i--;
        }
        return diigit;
    }
}