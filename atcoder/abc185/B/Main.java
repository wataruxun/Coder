import java.io.*;
import java.util.*;

class Main {
    static final String YES = "Yes";
    static final String NO = "No";

    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();

        int a[] = new int[M];
        int b[] = new int[M];

        for (int i = 0; i < M; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        solve(N, M, T, a, b);
    }

    static void solve(int N, int M, int T, int a[], int b[]) {
        int maxN = N;
        int time = 0;

        for (int i = 0; i < M; i++) {
            if (N - (a[i] - time) > 0) {
                N = N - (a[i] - time) + (b[i] - a[i]);
                if (N > maxN) {
                    N = maxN;
                }
                time = b[i];
            } else {
                System.out.println("No");
                return;
            }
        }

        if (N - (T - time) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
