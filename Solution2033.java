import java.util.ArrayList;
import java.util.Scanner;

/*
Created by Vladislav Stankevich
04.03.2020
 */

public class Solution2033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>(n+1);
        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }

        for (int i = n-1; i >= 0; i--) {
            if (array.get(i) != 9) {array.set(i, array.get(i)+1);break;}
            if (array.get(i) == 9) { array.set(i, 0);}
            if (array.get(0)== 0) {array.add(0, 1);}
        }
        int size=array.size();
        System.out.println(size);
        for (int i = 0; i < size; i++)
        System.out.print(array.get(i)+" ");
    }
}
