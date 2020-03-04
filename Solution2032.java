import java.util.ArrayList;
import java.util.Scanner;

/*
Created by Vladislav Stankevich
04.03.2020
 */

public class Solution2032 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
       ArrayList<Integer> array =new ArrayList<Integer>(n);
        for (int i=0; i<n; i++){
        array.add(scanner.nextInt());
        }

        int m = scanner.nextInt();
        ArrayList<Integer> array2 =new ArrayList<Integer>(n);
        String s2= new String();
        for (int i=0; i<m; i++){
            array2.add(scanner.nextInt());
        }
        int res=0;
        if (m>n) {res=-1;}
        if (m<n) {res=1;}
        if (m==n) {
            for (int i=0; i<n; i++)
            {if (array.get(i)>array2.get(i)) {res=1;break;}
                if (array.get(i)<array2.get(i)) {res=-1;break;}
                res=0;
                            }
        }
        System.out.println(res);
     }
}