import java.util.ArrayList;
import java.util.Scanner;

/*
Created by Vladislav Stankevich
04.03.2020
 */

public class Solution2024 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }
        int s = array.size();
        int k = 0;
        for (int i = 0; i < s / 2; i++) {
            if (array.get(i) != array.get(n - 1 - i)) {
                k++;
            }
        }
        System.out.println(k);
    }
}
