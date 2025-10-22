class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int nr = maze.length;
        int nc = maze[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{entrance[0], entrance[1], 0});
        maze[entrance[0]][entrance[1]] = '+';
        int[][] dir = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int row = curr[0];
            int col = curr[1];
            int steps = curr[2];
            for (int[] d : dir) {
                int currR = row + d[0];
                int currC = col + d[1];
                if (currR >= 0 && currR < nr && currC >= 0 && currC < nc) {
                    if (maze[currR][currC] == '.') {
                        if ((currR != entrance[0] || currC != entrance[1]) &&
                            (currR == 0 || currR == nr - 1 || currC == 0 || currC == nc - 1)) {
                            return steps + 1;
                        }
                        maze[currR][currC] = '+';
                        queue.offer(new int[]{currR, currC, steps + 1});
                    }
                }
            }
        }
        return -1;
    }
}