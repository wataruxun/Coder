import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long a;
        a = sc.nextLong();
        long b;
        b = sc.nextLong();
        long c;
        c = sc.nextLong();
        long d;
        d = sc.nextLong();
        solve(a, b, c, d);
    }

    static void solve(long a, long b, long c, long d) {
        long sumA = a * d;
        long sumB = b * c;
        System.out.println(sumA - sumB);
    }
}
