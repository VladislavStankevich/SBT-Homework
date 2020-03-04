import java.util.Scanner;

import static java.lang.Math.pow;

/*
Created by Vladislav Stankevich
04.03.2020
 */

public class Solution2007 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = 1;
        int k = 0;

        while (n % pow(2, m) == 0) {
            k++;
            m++;
        }
        System.out.println(k);
    }
}
