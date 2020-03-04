import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Created by Vladislav Stankevich
04.03.2020
 */

public class Solution2027 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }
        int l1 = scanner.nextInt();
        int r1 = scanner.nextInt();
        int l2 = scanner.nextInt();
        int r2 = scanner.nextInt();

        for (int i = 0; i <= (r1 - l1) / 2; i++) {
            Collections.swap(array, (l1 + i) - 1, (r1 - i) - 1);
        }
        for (int i = 0; i <= (r2 - l2) / 2; i++) {
            Collections.swap(array, (l2 + i) - 1, (r2 - i) - 1);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array.get(i) + " ");
        }
    }

}