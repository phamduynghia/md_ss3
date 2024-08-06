import java.util.Scanner;

public class baitap2_ss3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int N = 10;

        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};

        System.out.println("Mảng ban đầu: " + arr);
        printArray(arr);

        System.out.print("Nhập giá trị cần chèn: ");
        int valueToInsert = scanner.nextInt();

        System.out.print("Nhập vị trí cần chèn (0 đến " + (N - 1) + "): ");
        int indexToInsert = scanner.nextInt();

        if (indexToInsert < 0 || indexToInsert >= N) {
            System.out.println("Vị trí không hợp lệ. Không thể chèn giá trị.");
        } else {

            int[] newArray = new int[N];

            for (int i = 0; i < N; i++) {
                if (i < indexToInsert) {
                    newArray[i] = arr[i];
                } else if (i == indexToInsert) {
                    newArray[i] = valueToInsert;
                } else {
                    newArray[i] = arr[i - 1];
                }
            }

            System.out.println("Mảng sau khi chèn giá trị:");
            printArray(newArray);
        }

        scanner.close();
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}


