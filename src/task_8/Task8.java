package task_8;
import java.util.Scanner;

public class Task8 {

    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;

        return isAllDigits(s, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (isAllDigits(s, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

