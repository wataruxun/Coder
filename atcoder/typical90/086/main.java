import java.io.*;
import java.util.*;

class Main {
    static final long MOD = 1000000007;

    // Generated by 2.12.0 https://github.com/kyuridenamida/atcoder-tools  (tips: You use the default template now. You can remove this line by using your custom template)
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long Q;
        Q = sc.nextLong();
        long[] x = new long[(int)(Q)];
        long[] y = new long[(int)(Q)];
        long[] z = new long[(int)(Q)];
        long[] w = new long[(int)(Q)];
        for(int i = 0 ; i < Q ; i++){
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            z[i] = sc.nextLong();
            w[i] = sc.nextLong();
        }
        solve(N, Q, x, y, z, w);
    }

    static void solve(long N, long Q, long[] x, long[] y, long[] z, long[] w){

    }
}
