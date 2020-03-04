import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.pow;

/*
Created by Vladislav Stankevich
04.03.2020
 */

public class Solution2008 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }
        int m = 0;
        int sum = 0;
        while (pow(2, m) <= n) {
            sum = sum + array.get((int) pow(2, m) - 1);
            m++;
        }
        System.out.println(sum);
    }
}