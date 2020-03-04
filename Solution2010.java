import java.util.Scanner;

/*
Created by Vladislav Stankevich
04.03.2020
 */

public class Solution2010 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long k = 0;
        if (a < b) {
            long c = a;
            a = b;
            b = c;
        }
        while (((a - b) >= 0) && (a != 0 && b != 0)) {
            a = a - b;
            k++;
            if (a < b) {
                long c = a;
                a = b;
                b = c;
            }
        }
        System.out.println(k + " " + a);

    }
}