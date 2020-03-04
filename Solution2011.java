import java.util.Scanner;

/*
Created by Vladislav Stankevich
04.03.2020
 */

public class Solution2011 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 7) {
            System.out.println("preschool child");
        }
        if (age >= 7 && age<=17) {
            System.out.println("schoolchild "+(age-6));
        }
        if (age >= 18 && age<=22) {
            System.out.println("student "+(age-17));
        }
        if (age > 22) {
            System.out.println("specialist");
        }
    }

}
