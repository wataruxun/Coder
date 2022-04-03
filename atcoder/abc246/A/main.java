import java.util.*;

class main {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long[] x = new long[(int)(3)];
        long[] y = new long[(int)(3)];
        for(int i = 0 ; i < 3 ; i++){
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
        }
        solve(x, y);
    }

    static void solve(long[] x, long[] y){
        long solve_x=0, solve_y=0;
        if(x[0] == x[1]) solve_x = x[2];
        if(x[0] == x[2]) solve_x = x[1];
        if(x[1] == x[2]) solve_x = x[0];
        if(y[0] == y[1]) solve_y = y[2];
        if(y[0] == y[2]) solve_y = y[1];
        if(y[1] == y[2]) solve_y = y[0];
        System.out.println(solve_x + " " + solve_y);
    }
}
