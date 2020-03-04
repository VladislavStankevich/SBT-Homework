import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Created by Vladislav Stankevich
04.03.2020
 */

public class Solution2021 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i=0; i<n; i++){
        array.add(scanner.nextInt());}
        int i1=Collections.max(array);
        for (int i=0; i<n; i++){
            if (array.get(i)==i1) {array.set(i, array.get(i)/2);}
        }
        int i2 = Collections.max(array);
        for (int i=0; i<n; i++){
            if (array.get(i)==i2) {array.set(i, array.get(i)/2);}
        }
        for (int i=0; i<n; i++){
        System.out.print(array.get(i)+" ");}
    }
}