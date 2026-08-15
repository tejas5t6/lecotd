class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;
        int[][]mega_interval=new int[n+1][2];
        for(int i=0;i<n;i++){
            mega_interval[i][0]=intervals[i][0];
            mega_interval[i][1]=intervals[i][1];
        }
        mega_interval[n][0]=newInterval[0];
        mega_interval[n][1]=newInterval[1];
        Arrays.sort(mega_interval,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>list=new ArrayList<>();
        list.add(mega_interval[0]);
        for(int i=1;i<mega_interval.length;i++){
            int []prev=list.get(list.size()-1);
            int []curr=mega_interval[i];
            if(prev[1]>=curr[0]){
                prev[0]=Math.min(prev[0],curr[0]);
                prev[1]=Math.max(prev[1],curr[1]);
            }
            else list.add(mega_interval[i]);
        }
        int res[][]=new int[list.size()][2];
        for(int i=0;i<list.size();i++) res[i]=list.get(i);

        return res;

    }
}