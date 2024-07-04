package intermediate;

public class MatrixTranspose {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 3, 4},
                {2, 4, 3},
                {3, 4, 5}
        };

        int[][] transpose = transposeMatrix(matrix);

        System.out.println("Printing Matrix After Transpose:");
        printMatrix(transpose);
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] transpose = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
