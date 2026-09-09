public class Exercise2 {

    public static void main(String[] args) {
        // Khởi tạo các ma trận ví dụ
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] matrix2 = {
            {7, 8, 9},
            {10, 11, 12}
        };

        System.out.println("--- Original Matrix 1 ---");
        printMatrix(matrix1);

        System.out.println("--- Original Matrix 2 ---");
        printMatrix(matrix2);

        System.out.println("--- Add Two Matrices ---");
        int[][] sumMatrix = addMatrices(matrix1, matrix2);
        printMatrix(sumMatrix);

        System.out.println("--- Multiply Matrix 1 by 3 ---");
        int[][] multipliedMatrix = multiplyMatrix(matrix1, 3);
        printMatrix(multipliedMatrix);
    }

    /**
     * Hàm cộng hai ma trận cùng kích thước
     */
    public static int[][] addMatrices(int[][] m1, int[][] m2) {
        // Kiểm tra tính hợp lệ của kích thước
        if (m1.length == 0 || m2.length == 0 || m1.length != m2.length || m1[0].length != m2[0].length) {
            System.out.println("Error: Matrices must have the same size.");
            return null;
        }

        int rows = m1.length;
        int cols = m1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }

    /**
     * Hàm nhân ma trận với một số thực (scalar multiplication)
     */
    public static int[][] multiplyMatrix(int[][] matrix, int number) {
        if (matrix.length == 0) return null;

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[i][j] * number;
            }
        }
        return result;
    }

    /**
     * Hàm in ma trận ra màn hình
     */
    public static void printMatrix(int[][] matrix) {
        if (matrix == null) return;
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                if (j < matrix[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("]");
        }
    }
}