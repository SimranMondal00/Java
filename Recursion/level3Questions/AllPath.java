package Recursion.level3Questions;

public class AllPath {
    public static void main(String[] args) {
        boolean [][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        allPath("",board,0,0);
    }

    private static void allPath(String s, boolean[][] maze, int r, int c) {
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(s);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        if(r<maze.length-1){
            allPath(s+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            allPath(s+'R',maze,r,c+1);
        }
        if(r>0){
            allPath(s+'U',maze,r-1,c);
        }
        if(c>0){
            allPath(s+'L',maze,r,c-1);
        }
        maze[r][c]=true;
    }
}
