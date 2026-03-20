package task_1_PrintDigits;

public class task1_PrintDigits {
    public static void  printDigits(int n){
        if(n < 10){
            System.out.println(n);
            return;
        }
        printDigits(n / 10);
        System.out.println(n % 10);

    }
    public static void main(String[] args) {
        int number = 54321;
        printDigits(number);

    }
}
