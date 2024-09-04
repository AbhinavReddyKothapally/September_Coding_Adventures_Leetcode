class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
       Set<String> obstacleSet = new HashSet<>();
       
       for(int[] obstacle: obstacles){
        obstacleSet.add(obstacle[0]+","+ obstacle[1]);
       }

        int[][] dirs = {{0,1}, {1,0},{0,-1}, {-1,0}};
        int dir=0, x=0,y=0, max=0;
        for(int cmd: commands){
            if(cmd == -1){
                dir = (dir+1)%4;
            }

            else if(cmd == -2){
                dir = (dir+3)%4;
            }

            else{
                for(int i=0; i<cmd; i++){
                    int newx = x+dirs[dir][0];
                    int newy = y+dirs[dir][1];

                    if(!obstacleSet.contains(newx+","+newy)){
                        x=newx;
                        y=newy;
                        max = Math.max(max, (x*x+ y*y));
                    }
                    else{
                        break;
                    }
                }
            }
        }

        return max;

    }
}
