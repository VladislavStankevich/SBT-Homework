import java.util.Scanner;

/*
Created by Vladislav Stankevich
04.03.2020
 */

public class Solution2016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = b * b - 4 * a * c;

        if (a == 0 && b == 0 && c == 0) {
            System.out.println("-1");
        }
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("0");
        }
        if (a == 0 && b != 0) {
            System.out.println("1");
        }

        if (a != 0) {
            if (d > 0) {
                System.out.println("2");
            }
            if (d == 0) {
                System.out.println("1");
            }
            if (d < 0) {
                System.out.println("0");
            }
        }
    }
}