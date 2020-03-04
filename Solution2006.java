import java.util.Scanner;

public class Solution2006 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dlina = scanner.nextInt();
        int foot = dlina / 36;
        int inch = (dlina % 36) / 3;
        if ((dlina % 36) % 3 == 2) {
            inch++;
            if (inch == 12) {
                inch = 0;
                foot++;
            }
        }
        System.out.println(foot + " " + inch);
    }
}