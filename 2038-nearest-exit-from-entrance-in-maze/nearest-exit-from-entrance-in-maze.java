class Solution {
    public int nearestExit(char[][] maze, int[] e) {
        int R = maze.length, C = maze[0].length;
        int[] dir = {0, 1, 0, -1, 0};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{e[0], e[1]});
        maze[e[0]][e[1]] = '+'; 
        
        int steps = -1;
        while (!q.isEmpty()) {
            steps++;
            int qsize = q.size();
            while (qsize-- > 0) {
                int[] cell = q.poll();
                int row = cell[0], col = cell[1];
                if (row == 0 || row == R - 1 || col == 0 || col == C - 1) {
                    if (steps != 0) return steps;
                }
                
                for (int i = 0; i < 4; i++) {
                    int ar = row + dir[i], ac = col + dir[i+1];
                    if (ar >= 0 && ar < R && ac >= 0 && ac < C && maze[ar][ac] == '.') {
                        maze[ar][ac] = '+'; 
                        q.add(new int[]{ar, ac});
                    }
                }
            }
        }
        return -1; 
    }
}