class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length; // number of rows
        int m = matrix[0].length; // number of columns
        int col0 = 1; // Variable to mark if the first column needs to be zeroed

        // Step 1: Traverse the matrix and mark the first row and column accordingly
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    // Mark the i-th row
                    matrix[i][0] = 0;

                    // Mark the j-th column
                    if (j != 0)
                        matrix[0][j] = 0;
                    else
                        col0 = 0; // Mark that the first column needs to be zeroed
                }
            }
        }

        // Step 2: Traverse the matrix again and set elements to 0 based on the marks
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Handle the first row separately if needed
        if (matrix[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 4: Handle the first column separately if needed
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
