import java.util.ArrayList;
import java.util.Scanner;

/*
Created by Vladislav Stankevich
04.03.2020
 */

public class Solution2018 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j <= i; j++) {
                array.add(i);
                if (array.size()==n) break;
            }
            if (array.size()==n) break;
        }
        int b = 0;
        for (int i = 0; i < n; i++) {
            if (array.get(i) % 2 != 0 || array.get(i) == 1) {
                b = b + scanner.nextInt();
            } else {
                b = b - scanner.nextInt();
            }
        }
        System.out.println(b);
    }
}
