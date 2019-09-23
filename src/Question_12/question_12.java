package Question_12;
import java.util.*;

public class question_12 {

    private static void findArray(int n, int k) {
        int[] a = new int[k];
        int s;
        int i = 0;
        System.out.println("Array a[i]: ");
        while (k != 0) {
            s = k % 10;
            k = k / 10;
            i++;
            a[i] = s;
            if (a[i] <= n) {
                System.out.print(a[i] + "\t");
            } else {
                System.out.println("Error. Repeat one more time");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter k: ");
        int k = scanner.nextInt();
        findArray(n,k);
    }
}









