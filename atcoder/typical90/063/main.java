import java.io.*;
import java.util.*;

class Main {

    // Generated by 2.12.0 https://github.com/kyuridenamida/atcoder-tools  (tips: You use the default template now. You can remove this line by using your custom template)
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long H;
        H = sc.nextLong();
        long W;
        W = sc.nextLong();
        long[][] P = new long[(int)(H)][(int)(W)];
        for(int i = 0 ; i < H ; i++){
            for(int j = 0 ; j < W ; j++){
                P[i][j] = sc.nextLong();
            }
        }
        solve(H, W, P);
    }

    static void solve(long H, long W, long[][] P){

    }
}