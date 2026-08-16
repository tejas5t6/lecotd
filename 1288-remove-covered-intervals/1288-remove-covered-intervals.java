class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
    //    Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
    //    List<int[]> list=new ArrayList<>();
    //    list.add(intervals[0]);
    //    for(int i=1;i<intervals.length;i++){
    //     int []prev=list.get(list.size()-1);
    //     int []curr=intervals[i];
    //     if((prev[0]<=curr[0] && prev[1]>=curr[1])||(curr[0]<=prev[0] && curr[1]>=prev[1])){
    //         prev[0]=Math.min(prev[0],curr[0]);
    //         prev[1]=Math.max(curr[1],prev[1]);
    //     }
    //     else list.add(intervals[i]);
    //    }
    //    return list.size();
    // the above approach is good but it is little bit chaotic lets do this with one go check 
    //the concept is simpler we wre going to sort the array and then compare the max_end seen untill current  array and update the count accordingly
    Arrays.sort(intervals,(a,b)->{ // here we are sorting the intervals by start time //but if the start time is same the we are sorting it by end time so that we //can get the maximum maxend for equal start time;
    //[1,2][1,3][1,5]
    // after sorting [1,5][1,3][1,2] making the things easier for us and choosing the baap of the maxend whose starting time is same. 
        int val=Integer.compare(a[0],b[0]);
        return val==0?Integer.compare(b[1],a[1]):val;
    });
    int count=1;
    int maxend=intervals[0][1];
    for(int i=1;i<intervals.length;i++){
        if(intervals[i][1]>maxend){
            count++;
            maxend=intervals[i][1];
        }
    }
    return count;
    }
}