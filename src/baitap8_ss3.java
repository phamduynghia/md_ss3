import java.util.Scanner;

public class baitap8_ss3 {
    public static void main(String[] args) {

        String str = "Hello, World!";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ký tự cần đếm: ");
        char ch = scanner.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("Ký tự '" + ch + "' xuất hiện " + count + " lần trong chuỗi.");
    }
}


