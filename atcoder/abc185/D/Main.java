import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int a[] = new int[M];
        for (int i = 0; i < M; i++) {
            a[i] = sc.nextInt();
        }

        solve(N, M, a);
    }

    static void solve(int N, int M, int a[]) {
        a = Arrays.sort(a);
        int minD = N;
        int cell[] = new int[N + 1];

        for (int i = 0; i < M; i++) {
            cell[i] = 1;
        }

    }
}
