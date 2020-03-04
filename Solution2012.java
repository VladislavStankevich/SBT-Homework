import java.util.Scanner;

/*
Created by Vladislav Stankevich
04.03.2020
 */

public class Solution2012 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();

        if ((a1 == a2 && a1 == (b1 + b2)) || (a1 == b2 && (a1 == (a2 + b1))) || (b1 == a2 && b1 == (a1 + b2)) || (b1 == b2 && (b1 == (a1 + a2)))) {
            System.out.println("YES");}
            else {
            System.out.println("NO");
        }

    }
}
