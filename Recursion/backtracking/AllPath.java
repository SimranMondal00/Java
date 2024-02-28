package Recursion.level3Questions.backtracking;

import java.util.Arrays;

public class AllPath {
    public static void main(String[] args) {
        boolean [][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int [][] path = new int[board.length][board[0].length];
        allPathPrint("",board,0,0,path,1);
    }

    private static void allPathPrint(String s, boolean[][] maze, int r, int c, int[][] path, int step) {
        if(r==maze.length-1 && c==maze[0].length-1){
            for(int [] arr : path){
                path[r][c]=step;
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(s);
            System.out.println();
            return;
        }
       if(!maze[r][c]){
           return;
       }
       maze[r][c]=false;
       path[r][c]=step;
       if(r<maze.length-1){
           allPathPrint(s+'D',maze,r+1,c,path,step+1);
       }
       if(c<maze[0].length-1){
           allPathPrint(s+'R',maze,r,c+1,path,step+1);
       }
       if(r>0){
           allPathPrint(s+'U',maze,r-1,c,path,step+1);
       }
       if(c>0){
           allPathPrint(s+'L',maze,r,c-1,path,step+1);
       }
       maze[r][c]=false;
       path[r][c]=0;
    }
}
