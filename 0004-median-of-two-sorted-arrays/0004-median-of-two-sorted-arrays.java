class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int merged[] = new int [n+m];
        int k =0;
        for(int i=0;i<n;i++){
            merged[k]=nums1[i];
            k++;
        }
        for(int j=0;j<m;j++){
            merged[k]=nums2[j];
            k++;
        }
        Arrays.sort(merged);
         int len = merged.length;

        if (len % 2 == 1) {
            
            return (double) merged[len/2];
        } else {
            
            int m1 = merged[len / 2 -1];
            int m2 = merged[len/ 2];
            return ((double) m1 + (double) m2) / 2;


    }
}
}