import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long X;
        X = sc.nextLong();
        String S;
        S = sc.next();
        solve(N, X, S);
    }

    static void solve(long N, long X, String S) {
        long point = X;
        String[] answerArray = S.split("");

        for (int i = 0; i < answerArray.length; i++) {
            if (answerArray[i].equals("o")) {
                point += 1;
            } else {
                if (point > 0) {
                    point -= 1;
                }
            }
        }

        System.out.println(point);

    }
}
