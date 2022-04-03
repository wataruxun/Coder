import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        int K;
        K = sc.nextInt();
        int X;
        X = sc.nextInt();
        int[] A = new int[(int)(N)];
        for(int i = 0 ; i < N ; i++){
            A[i] = sc.nextInt();
            if(A[i]>K&&K>0){
                for(int j = 0; j<K;j++){
                    if(A[i]<K) break;
                    A[i] -= X;
                    if(K==0)break;
                    K--;
                }
            }
        }
        solve(N, K, X, A);
    }

    static void solve(int N, int K, int X, int[] A){
        Arrays.sort(A);
        for(int i = 0; i < K; i++){
            if(N-1-i>0) break;
            A[N-1-i] = 0;
        }
        
        int sum = Arrays.stream(A).sum();

        System.out.println(sum);
    }
}
