class Solution {
    public int findCircleNum(int[][] adj) {
        int n=adj.length;
        int cnt=0;
        boolean[]visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                bfs(i,visited,adj);
                cnt++;
            }
        }
        return cnt;
    }
    public void bfs(int i,boolean[]visited,int[][]adj){
        int n=adj.length;
        Queue <Integer> q=new LinkedList<>();
        q.add(i);
        while(q.size()>0){
            int front =q.remove();
            for(int j=0;j<n;j++){
                if(adj[front][j]==1 && visited[j]==false){
                    q.add(j);
                    visited[j]=true;
                }
            }
        }
    }
}