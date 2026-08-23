class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    public void bfs(int i,int j,char[][]grid,boolean[][]visited){
         int m=grid.length;
        int n=grid[0].length;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(i,j));
        while(q.size()>0){
            Pair frnt =q.remove();
            int row=frnt.row;
            int col=frnt.col;
            //we need fucking top and left side too because it is must needed 
            //[["1","1","1"]
            //["0","1","0"]
            //["1","1","1"]] because at this point the leftmost 1 is not reacjable if i dont take left of the array to be considered.
            //top-> row-1,col
            if(row>0){
                if(visited[row-1][col]==false && grid[row-1][col]=='1'){
                    q.add(new Pair(row-1,col));
                    visited[row-1][col]=true;
                }
            }
            //bottom-> row+1,col
             if(row+1<m){
                if(visited[row+1][col]==false && grid[row+1][col]=='1'){
                    q.add(new Pair(row+1,col));
                    visited[row+1][col]=true;
                }
             }
            //  left->row,col-1
              if(col>0){
                if(visited[row][col-1]==false && grid[row][col-1]=='1'){
                    q.add(new Pair(row,col-1));
                    visited[row][col-1]=true;
                }
              }
            //   right-> row,col+1
               if(col+1<n){
                if(visited[row][col+1]==false && grid[row][col+1]=='1'){
                    q.add(new Pair(row,col+1));
                    visited[row][col+1]=true;
                }
               }
        }
    }
    public int numIslands(char[][] grid) {
        boolean[][]visited=new boolean[grid.length][grid[0].length];
        int m=grid.length;
        int n=grid[0].length;
        int cnt=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && visited[i][j]==false){
                    bfs(i,j,grid,visited);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}