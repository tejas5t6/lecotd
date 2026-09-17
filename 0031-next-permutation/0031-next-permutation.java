class Solution {
    public static void reverse(int[]arr,int left,int right){
        while(left<right){
            int t=arr[left];
            arr[left]=arr[right];
            arr[right]=t;
            left++;
            right--;
        }
    }
    public void nextPermutation(int[] arr) {
        int n=arr.length;
        int i=n-2;
        while(i>=0 && arr[i]>=arr[i+1])i--;
        if(i>=0){
            int j=n-1;
            while(arr[j]<=arr[i]) j--;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        }
        reverse(arr,i+1,n-1);

    }
}