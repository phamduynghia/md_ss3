import java.util.Scanner;

public class baitap7_ss3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số dòng và số cột của ma trận vuông: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Nhập các giá trị của ma trận:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Nhập giá trị cho phần tử tại vị trí (%d, %d): ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận vừa nhập:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int sumMainDiagonal = 0;
        int sumSecondaryDiagonal = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sumMainDiagonal += matrix[i][j];
                }
                if (i + j == n - 1) {
                    sumSecondaryDiagonal += matrix[i][j];
                }
            }
        }

        System.out.println("Tổng các giá trị ở đường chéo chính: " + sumMainDiagonal);
        System.out.println("Tổng các giá trị ở đường chéo phụ: " + sumSecondaryDiagonal);
    }
}


