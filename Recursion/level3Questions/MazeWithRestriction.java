package Recursion.level3Questions;

public class MazeWithRestriction {
    public static void main(String[] args) {
        boolean [] [] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathRestriction("",board,0,0);
    }

    private static void pathRestriction(String p , boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if(maze[row][col]==false){
            return;
        }
        if(row<maze.length-1){
            pathRestriction(p+'D',maze,row+1,col);
        }
        if(col<maze[0].length-1){
            pathRestriction(p+'R',maze,row,col+1);
        }
    }
}
