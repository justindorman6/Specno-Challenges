public class MazeRunner {

    public static void main(String[] args) {

        int[][] maze = {{1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 0, 0, 3}, {1, 0, 1, 0, 1, 0, 1}, {0, 0, 1, 0, 0, 0, 1}, {1, 0, 1, 0, 1, 0, 1}, {1, 0, 0, 0, 0, 0, 1}, {1, 2, 1, 0, 1, 0, 1}};

        char[] directions = {'N', 'N', 'N', 'N', 'N', 'E', 'E', 'E', 'E', 'E'};
        System.out.println(mazerunner(maze, directions));
    }

    public static String mazerunner(int[][] maze, char[] directions) {
        int row = 0;
        int col = 0;
        //Determines the row and col starting positions
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 2) {
                    row = i;
                    col = j;
                }
            }
        }

        for (char direction : directions) {
            if (direction == 'N') {
                row -= 1;
            } else if (direction == 'S') {
                row += 1;
            } else if (direction == 'W') {
                col -= 1;
            } else {
                col += 1;
            }

            if (maze[row][col] == 1) {
                return "Dead";
            }
            if (maze[row][col] == 3) {
                return "Finish";
            }
        }

        return "Lost";
    }

}
