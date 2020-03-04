import java.util.ArrayList;
import java.util.Scanner;

/*
Created by Vladislav Stankevich
04.03.2020
 */

public class Solution2013 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>(n);
        array.add(scanner.nextInt());
        int k = array.get(0);
        int q = 1;
        for (int i = 1; i < n; i++) {
            array.add(scanner.nextInt());
            if (k == array.get(i)) {
                q++;
            }
            if (k > array.get(i)) {
                k = array.get(i);
                q = 1;
            }
        }
        System.out.println(q);
    }
}

