import java.util.Scanner;

public class baitap1_ss3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Nhập các giá trị cho mảng:");
        for (int i = 0; i < size; i++) {
            System.out.printf("Phần tử %d: ", i);
            array[i] = scanner.nextInt();
        }

        System.out.println("Mảng ban đầu:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


        System.out.print("Nhập phần tử cần xóa: ");
        int valueToRemove = scanner.nextInt();

        int indexMore = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == valueToRemove) {
                indexMore = i;
                break;
            }
        }

        if (indexMore == 1) {
            System.out.println("Phần tử đã có trong mảng.");
            return;
        }

        System.out.println("Phần tử cần xóa nằm ở vị trí: " + indexMore);


        for (int i = indexMore; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;

        System.out.println("Mảng sau khi xóa:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
}


