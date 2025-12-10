public class Q09_LinearSearch2D {

    static boolean linearSearch(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Found at position: [" + i + "][" + j + "]");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int target = 5;

        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }

        if (!linearSearch(matrix, target)) {
            System.out.println("Element not found!");
        }
    }
}