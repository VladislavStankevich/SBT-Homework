import java.util.ArrayList;
import java.util.Scanner;

/*
Created by Vladislav Stankevich
04.03.2020
 */

public class Solution2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = b - a + 1;
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = a; i <= b; i++) {
            int k = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    k++;
                }
            }
            array.add(k);
        }
        int max = array.get(0);
        for (int x = 1; x < n; x++) {
            if (max < array.get(x)) {
                max = array.get(x);
            }
        }
        int z = 0;
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        for (int y = 0; y < n; y++) {
            if (array.get(y) == max) {
                array2.add(a + y);
                z++;
            }
        }
        System.out.println(z);
        System.out.print(array2.get(0));
        for (int i = 1; i < z; i++) {
            System.out.print("," + array2.get(i));
        }
    }

}

