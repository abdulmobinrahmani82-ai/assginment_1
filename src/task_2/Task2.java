package task_2;

import java.util.Scanner;
public class Task2 {

    public static void readArray(int[] arr, int n, Scanner sc) {
        if (n == 0) return;

        readArray(arr, n - 1, sc);
        arr[n - 1] = sc.nextInt();
    }

    public static int sum(int[] arr, int n) {
        if (n == 0) return 0;

        return arr[n - 1] + sum(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        readArray(arr, n, sc);

        int total = sum(arr, n);
        double average = (double) total / n;

        System.out.println(average);
    }
}
