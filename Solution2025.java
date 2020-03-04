import java.util.ArrayList;
import java.util.Scanner;

/*
Created by Vladislav Stankevich
04.03.2020
 */

public class Solution2025 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }

        int m = scanner.nextInt();
        ArrayList<Integer> array2 = new ArrayList<Integer>(m * 2);
        int min = 0;
        for (int i = 0; i < m * 2; i++) {
            array2.add(scanner.nextInt());
        }

        for (int i = 1; i <= m; i++) {
            int l = array2.get(i*2 - 2);
            int r = array2.get(i*2 - 1);
            min = array.get(l-1);
            for (int j = l; j <= r; j++) {
                if (min > array.get(j-1)) {
                    min = array.get(j-1);
                }
            }
            System.out.println(min);
        }
    }
}

