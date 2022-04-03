import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long K;
        K = sc.nextLong();
        long X;
        X = sc.nextLong();
        long[] A = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
            A[i] = sc.nextLong();
        }
        solve(N, K, X, A);
    }

    static void solve(long N, long K, long X, long[] A){
        long sum = 0;
        for(int i = 0; i < N; i++){
            sum += A[i];
        }

        long m = 0;
        for(int i = 0; i < N; i ++){
            m += A[i]/X;
        }
        m = Math.min(m, K);
        sum -= m*X;
        K -= m;

        for(int i = 0; i < N; i++){
            A[i] %= X;
        }

        Arrays.sort(A);
        
        for(int i = (int)N-1; i >= 0; i--){
            if(K == 0) break;
            sum -= A[i];
            K--;
        }

        System.out.println(sum);
    }
}
