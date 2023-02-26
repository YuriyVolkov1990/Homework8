import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1+2");
        int[] arr = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(arr));
        double[] fraction = new double[]{1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(fraction));
        char[] my = new char[]{9403, 9418, 9400, 9408};
        System.out.println(Arrays.toString(my));
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = new int[]{1, 2, 3};
        for (int index = 2; index >= 0; index--) {
            if (index == 0) {
                System.out.println(arr[index]);
            } else System.out.print(arr[index] + ", ");
        }
        double[] fraction = new double[]{1.57, 7.654, 9.986};
        for (int index = 2; index >= 0; index--) {
            if (index == 0) {
                System.out.println(fraction[index]);
            } else System.out.print(fraction[index] + ", ");
        }
        char[] my = new char[]{9403, 9418, 9400, 9408};
        for (int index = 3; index >= 0; index--) {
            if (index == 0) {
                System.out.println(my[index]);
            } else System.out.print(my[index] + ", ");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] arr = new int[]{1, 2, 6, 9, 11};
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] % 2 != 0) {
                arr[index]= arr[index]+1;
                System.out.print(arr[index]+ ", ");
                } else System.out.print(arr[index]+", ");
        }
    }
}


