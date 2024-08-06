import java.util.Scanner;

public class baitap6_ss3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số dòng của mảng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int columns = scanner.nextInt();

        double[][] array = new double[rows][columns];
        System.out.println("Nhập các giá trị cho mảng:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Nhập giá trị cho phần tử tại vị trí (%d, %d): ", i, j);
                array[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Mảng vừa nhập:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("Nhập số cột cần tính tổng (tính từ 0): ");
        int columnIndex = scanner.nextInt();

        if (columnIndex < 0 || columnIndex >= columns) {
            System.out.println("Số cột nhập vào không hợp lệ.");
            return;
        }

        double sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += array[i][columnIndex];
        }

        System.out.println("Tổng các phần tử của cột " + columnIndex + " là: " + sum);
    }
}


