import java.util.*;

public class qwer {
    static boolean[] used = new boolean[100000];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        System.out.println(method(a, b));
    }
    public static boolean method(int[] a, int[] b) {
        boolean ok = false;
        int x = 0;
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j] && !used[j]) {
                    used[j] = true;
                    x++;
                }
            }
        }
        if (x == a.length)
            return true;
        else
            return false;
    }
}
