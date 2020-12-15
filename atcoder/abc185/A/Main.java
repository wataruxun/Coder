import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            if (min > a) {
                min = a;
            }
        }

        System.out.println(min);
    }
}
