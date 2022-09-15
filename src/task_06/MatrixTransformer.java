package task_06;

public class MatrixTransformer {
    public int[][] TransformMatrix(int[] array) {
        if (array.length == 0) {
            return new int[0][0];
        }
        int size = array.length;
        int[][] matrix = new int[size][size];
        System.arraycopy(array, 0, matrix[0], 0, size);
        for (int i = 1; i < size; i++) {
            System.arraycopy(matrix[i - 1], 1, matrix[i], 0, size - 1);
            matrix[i][size - 1] = matrix[i - 1][0];
        }
        return matrix;
    }
}

