/*
 Approach :
 step 1 : create a row array and a column array
 step 2 : iterate through the matrix,wherever you find zero,set that particular
          row[i] and col[j] as '1'
 step 3 : Now once again iterate throught the matrix,wherever you find row[i] or col[j]
          as '1',set matrix[i][j] as '0'
 step 4 : Done
 */

class Solution {
    public void setZeroes(int[][] matrix) {
        int row_size = matrix.length;
        int col_size = matrix[0].length;

        int row[] = new int[row_size];
        int col[] = new int[col_size];

        for(int i = 0; i < row_size; i++) {
            for(int j = 0 ; j < col_size; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i = 0; i < row_size; i++) {
            for(int j = 0 ; j < col_size; j++) {
                if(row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;   
                }
            }
        }

    }
}