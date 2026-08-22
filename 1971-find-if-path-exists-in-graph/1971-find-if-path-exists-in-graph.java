class Solution {
    public boolean validPath(int n, int[][] edges, int start, int end) { 
        List<List<Integer>> adj=new ArrayList<>();
        if(start==end)return true;
        for(int i=0;i<n;i++){
             List<Integer> lis=new ArrayList<>();
             adj.add(lis);

        }
        for(int i=0;i<edges.length;i++){
            int a=edges[i][0];
            int b=edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        
        boolean []visited=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        while(q.size()>0){
            int frnt=q.remove();
            for(int ele:adj.get(frnt)){
                if(!visited[ele]){
                    visited[ele]=true;
                    q.add(ele);
                    if(ele==end)break;
                }
            }
        }
        if(visited[end]==false)return false;
        return true;
    }
}