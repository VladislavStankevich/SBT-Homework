import java.util.ArrayList;
import java.util.Scanner;

/*
Created by Vladislav Stankevich
04.03.2020
 */

public class Solution2028 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<Integer> array = new ArrayList<Integer>(n);

        int k0 = 0;
        int k1 = 0;
        int k2 = 0;
        int k3 = 0;
        int k4 = 0;

        ArrayList<Integer> array2 = new ArrayList<Integer>(5);
        for (int i = 0; i < 5; i++) {
            array2.add(0);
        }

        for (int i = 0; i < n; i++)
        {array.add(scanner.nextInt());}

        for (int i = 0; i < n; i++) {
            if (array.get(i) == 0) {
                array2.set(0, (array2.get(0) + 1));
            }
            if (array.get(i) == 1) {
                array2.set(1, (array2.get(1) + 1));
            }
            if (array.get(i) == 2) {
                array2.set(2, (array2.get(2) + 1));
            }
            if (array.get(i) == 3) {
                array2.set(3, (array2.get(3) + 1));
            }
            if (array.get(i) == 4) {
                array2.set(4, (array2.get(4) + 1));
            }
        }
        for (int i = 0; i < 5; i++) {
            if (array2.get(i) != 0) {
                System.out.println(i + " " + array2.get(i));
            }
        }
    }
}