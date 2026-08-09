class Solution {
    public int minimumMountainRemovals(int[] nums) {
        // here this question will be done with the use LIS .So the intution is to find the longest increasing subsequence of an given
        //arry from both side and then see whic can contribute to longest increasing and then decreasing we will find its lenfth and subtract from the total length
        //                              arr 2 1 1 5 6 2 3 1 
        //lis from left side stored in  dp1 1 1 1 2 3 2 3 1             
        //lis from right side stored in dp2 2 1 1 3 3 2 2 1             mountin array 1 5 6 2 1 or 1 5 6 3 1 similarly many more 
        //arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
        //arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
        // now calculate dp1[i]+dp2[i]-1final_result =3+3-1=5
        //-1 is used because current index value will be considered twice so to remove redundancy we will do this 
        // now after the longest array is found so it will bw subtracted from the nums length to get the result.
        int n=nums.length;
        int dp1[]=new int[n];
        int dp2[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]) dp1[i]=Math.max(dp1[j],dp1[i]);
            }
            dp1[i]+=1;
        }
         for(int i=n-1;i>=0;i--){
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[i]) dp2[i]=Math.max(dp2[j],dp2[i]);
            }
            dp2[i]+=1;
        }
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           if(dp1[i]>1&&dp2[i]>1) maxi=Math.max(maxi,dp1[i]+dp2[i]-1);
        }

        return nums.length-maxi;
    }
}