class Solution {
    public void rotate(int[][] matrix) {
        int N = matrix.length;
        int rotate[][] = new int[N][N];
        for(int i = 0; i<N;i++){
            for(int j=0; j<N; j++){
                rotate[j][N-i-1] = matrix[i][j];
            }
        }
        for(int i=0;i<N;i++){
            System.arraycopy(rotate[i], 0, matrix[i], 0, N);
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.println(matrix[i][j]);
            }
        }
        return;
    }
}