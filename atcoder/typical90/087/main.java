import java.io.*;
import java.util.*;

class Main {

    // Generated by 2.12.0 https://github.com/kyuridenamida/atcoder-tools  (tips: You use the default template now. You can remove this line by using your custom template)
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long P;
        P = sc.nextLong();
        long K;
        K = sc.nextLong();
        long[][] A = new long[(int)(N)][(int)(N)];
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                A[i][j] = sc.nextLong();
            }
        }
        solve(N, P, K, A);
    }

    static void solve(long N, long P, long K, long[][] A){

    }
}
