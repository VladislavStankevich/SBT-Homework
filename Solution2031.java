import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Created by Vladislav Stankevich
04.03.2020
 */

public class Solution2031 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>(n);
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }
        for (int i = 0; i < n-1; i++) {
            int k = array.get(i);
            for (int j = i + 1; j < n; j++) {
                if (k == array.get(j)) {
                    if (array2.contains(k)==false)
                    {array2.add(k);
                    break;}
                }
            }

        }
        int s=array2.size();
        System.out.println(s);
        Collections.sort(array2);
        for (int i=0; i<s; i++)
        {System.out.print(array2.get(i)+" ");}
    }
    }
