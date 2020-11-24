import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        int T;
        T = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }
        solve(N, T, A);
    }

    static void solve(int N, int T, ArrayList<Integer> A) {
        int timeSum = 0;
        int remain = T;
        while (timeSum <= T) {
            int maxIndex = 0;
            for (int i = 0; i < A.size(); i++) {
                if (A.get(i) > remain) {
                    A.remove(i);
                }
            }
            if (A.isEmpty()) {
                break;
            }
            for (int i = 0; i < A.size(); i++) {
                if (A.get(i) > A.get(maxIndex)) {
                    maxIndex = i;
                }
            }
            if (remain - A.get(maxIndex) > 0) {
                timeSum += A.get(maxIndex);
                remain -= A.get(maxIndex);
                System.out.println(A.get(maxIndex));
                A.remove(maxIndex);
            } else {
                break;
            }
        }

        System.out.println(timeSum);

    }
}
