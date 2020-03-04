import java.util.ArrayList;
import java.util.Scanner;

/*
Created by Vladislav Stankevich
04.03.2020
 */

public class Solution2029 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }
        int min = array.get(0);

        for (int i = 1; i < n; i++) {
            if (min > array.get(i)) {
                min = array.get(i);
            }
        }
        ArrayList<Integer> array2 = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            if (array.get(i) == min) {
                array2.add(i + 1);
            }
        }
        int k=array2.size()/2;
        if (array2.size()%2==0) {System.out.println(array2.get(k-1));}
        else {System.out.println(array2.get(k));}
    }
}