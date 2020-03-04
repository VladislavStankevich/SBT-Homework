import java.util.ArrayList;
import java.util.Scanner;

/*
Created by Vladislav Stankevich
04.03.2020
 */

public class Solution2036 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(scanner.next());
        }

        boolean r;
        for (int i = 0; i < n; i++) {
            r = true;
            String s = list.get(i);
            if (s.length() > 2) {
                for (int j = 0; j < s.length() - 2; j++) {
                    if (glas(s.charAt(j)) && glas(s.charAt(j + 1)) && glas(s.charAt(j + 2))) {
                        r = false;
                        break;
                    }
                }
            }
            if (r == true) {
                System.out.println(s);
            }
        }
    }

    public static boolean glas(char a) {
        boolean b = false;
        if ((a == 'e') || (a == 'y') || (a == 'u') || (a == 'i') || (a == 'o') || (a == 'a')) b = true;
        return b;
    }

}
