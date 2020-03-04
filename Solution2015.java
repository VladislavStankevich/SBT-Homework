import java.util.Scanner;

/*
Created by Vladislav Stankevich
04.03.2020
 */

public class Solution2015 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 2; i <= n; i++) {
            int k = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    k = 1;
                }
            }
            if (k == 0) {
                System.out.println(i + " ");
            }
        }
    }
}