class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // int i=0;
        // int j=0;
        // for(int point[]:points){
        //     int sqr=((point[0]*point[0]) + (point[1]*point[1]));
        //     if(sqr>)
        // }
        int n=points.length;
        int distance[]=new int[points.length];
        Integer index[]=new Integer[points.length];
        for(int i=0;i<n;i++) distance[i]=((points[i][0]*points[i][0])+(points[i][1]*points[i][1]));
        for(int i=0;i<n;i++) index[i]=i;
        Arrays.sort(index,(a,b)->distance[a]-distance[b]);
        int res[][]=new int[k][2];
        for(int i=0;i<k;i++) res[i]=points[index[i]];
        return res;
    }
}