public class Q03_2DArrayOperations {

    static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows1 = a.length;
        int cols1 = a[0].length;
        int cols2 = b[0].length;
        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};

        System.out.println("Matrix A:");
        displayMatrix(a);
        System.out.println("Matrix B:");
        displayMatrix(b);

        System.out.println("A + B:");
        displayMatrix(addMatrices(a, b));

        System.out.println("A * B:");
        displayMatrix(multiplyMatrices(a, b));
    }
}