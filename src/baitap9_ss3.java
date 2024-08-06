public class baitap9_ss3 {
    public static void main(String[] args) {


        int[] arr = {10, 5, 20, 20, 4};

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        System.out.println("Số lớn thứ hai là: " + secondMax);


    }
}



//public class baitap9_ss3 {
//    public static void main(String[] args) {
//        int[] arr = {10, 5, 20, 20, 4};

//        int max = Integer.MIN_VALUE;
//        int max2 = Integer.MIN_VALUE;

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {

//                max2 = max;
//                max = arr[i];
//            } else if (arr[i] > max2 && arr[i] < max) {

//                max2 = arr[i];
//            }
//        }

//        System.out.println("Số lớn thứ hai là: " + max2);
//    }
//}
