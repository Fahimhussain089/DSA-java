package mazeProblems;

import java.util.ArrayList;

public class mazeProblem {
    public static void main(String[] args) {
        boolean[][] board = new boolean[][]{{true, true, true}, {true, false, true}, {true, true, true}};
        mazeProblem.pathR("", board, 0, 0);
    }

    public static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = mazeProblem.count(r - 1, c);
        int right = mazeProblem.count(r, c - 1);
        return left + right;
    }

    public static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            mazeProblem.path(p + "D", r - 1, c);
        }
        if (c > 1) {
            mazeProblem.path(p + "C", r, c - 1);
        }
    }

    public static ArrayList<String> pathReset(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<String>();
            System.out.println(p);
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<String>();
        if (r > 1) {
            list.addAll(mazeProblem.pathReset(p + "D", r - 1, c));
        }
        if (c > 1) {
            list.addAll(mazeProblem.pathReset(p + "R", r, c - 1));
        }
        return list;
    }

    public static void pathR(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        if (r < maze.length - 1) {
            mazeProblem.pathR(p + "D", maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            mazeProblem.pathR(p + "R", maze, r, c + 1);
        }
    }
}
