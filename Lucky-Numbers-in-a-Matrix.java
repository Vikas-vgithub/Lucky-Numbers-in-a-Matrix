class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> s1 = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (checkLucky(matrix, i, j)) {
                    s1.add(matrix[i][j]);
                }
            }
        }
        return s1;
    }

    public boolean checkLucky(int[][] matrix, int row, int col) {
        int element = matrix[row][col];
        
        // Check if element is the smallest in its row
        for (int j = 0; j < matrix[row].length; j++) {
            if (matrix[row][j] < element && j != col) {
                return false;
            }
        }

        // Check if element is the largest in its column
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] > element && i != row) {
                return false;
            }
        }

        return true;
    }
}
