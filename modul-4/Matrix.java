import java.util.Scanner;

class MatrixOperations {
    private int[][] matrix;

    public MatrixOperations(int[][] matrix) {
        this.matrix = matrix;
    }

    public int[][] multiply(MatrixOperations other) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    result[i][j] += this.matrix[i][k] * other.matrix[k][j];
                }
            }
        }
        return result;
    }

    public int[][] subtract(MatrixOperations other) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = this.matrix[i][j] - other.matrix[j][i];
            }
        }
        return result;
    }

    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] X = new int[2][2];
        int[][] Y = new int[2][2];

        System.out.println("Enter elements of matrix X (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                X[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements of matrix Y (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                Y[i][j] = scanner.nextInt();
            }
        }

        MatrixOperations matrixX = new MatrixOperations(X);
        MatrixOperations matrixY = new MatrixOperations(Y);

        System.out.println("Choose operation: 1 for multiplication, 2 for subtraction");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                int[][] multiplicationResult = matrixX.multiply(matrixY);
                System.out.println("Result of multiplication:");
                matrixX.printMatrix(multiplicationResult);
                break;
            case 2:
                int[][] subtractionResult = matrixX.subtract(matrixY);
                System.out.println("Result of subtraction:");
                matrixX.printMatrix(subtractionResult);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        scanner.close();
    }
}

