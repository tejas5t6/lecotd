class Solution {
    public int[] resultArray(int[] nums) {
       int n= nums.length;
       ArrayList<Integer> arr1=new ArrayList<>();
       ArrayList<Integer> arr2=new ArrayList<>();
       if(n==1)return nums;
       arr1.add(nums[0]);
       arr2.add(nums[1]);
       for(int i=2;i<n;i++){
       if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)) arr1.add(nums[i]);
       else arr2.add(nums[i]);
       }
       
       int res[]=new int[n];
       
            int k=0;
            int j=0;
        while(k<arr1.size()){
            res[k]=arr1.get(k);
            k++;
        }
         while(j<arr2.size()){
            res[k]=arr2.get(j);
            j++;
            k++;
        }
       
       return res;
    }
}
        // int []arr1=new int[(n%2==0)?n/2:(n/2)+1];
        // int []arr2=new int[n/2];
        // int res[]=new int[n];
        // if(n==1)return nums;
        // arr1[0]=nums[0];
        // arr2[0]=nums[1];
        // int k=1;
        // int j=1;
        // for(int i=2;i<n;i++){
        //     if(i%2==0){
        //         arr1[k]=nums[i];
        //         k++;
        //     }
        //     else {
        //         arr2[j]=nums[i];
        //         j++;
        //     }
        // }
        // k=0;
        // j=0;
        // if(arr1[arr1.length-1]<arr2[arr2.length-1]){
        //     while(k<arr1.length) {
        //         res[k]=arr1[k];
        //         k++;
        //     }
        //     while(j<arr2.length){
        //         res[k]=arr2[j];
        //         j++;
        //         k++;
        //     }
        // }
        // else{
            
        // }
        // return res;