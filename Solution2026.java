import java.util.ArrayList;
import java.util.Scanner;

/*
Created by Vladislav Stankevich
04.03.2020
 */

public class Solution2026 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }

        for (int i = 0; i < n; i++) {
            boolean change=false;
            for (int j = i + 1; j < n; j++) {
                if (array.get(i) < array.get(j)) {
                    array.set(i, array.get(j));
                    change=true;
                    break;
                }
            }
            if (change==false) {array.set(i, 0);}
       }
        for (int i=0; i<n; i++){
        System.out.print(array.get(i)+" ");}
    }
}