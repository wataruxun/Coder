import java.io.*;
import java.util.*;

class Main {

    // Generated by 2.12.0 https://github.com/kyuridenamida/atcoder-tools  (tips: You use the default template now. You can remove this line by using your custom template)
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long M;
        M = sc.nextLong();
        long[] L = new long[(int)(M)];
        long[] R = new long[(int)(M)];
        for(int i = 0 ; i < M ; i++){
            L[i] = sc.nextLong();
            R[i] = sc.nextLong();
        }
        solve(N, M, L, R);
    }

    static void solve(long N, long M, long[] L, long[] R){

    }
}
