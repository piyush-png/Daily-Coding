import java.util.*;

public class PowerOfTwo {
    public boolean check(int n) {
        if (n <= 0) {
            return false;
        }

        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n = n / 2;
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            PowerOfTwo obj = new PowerOfTwo();
            boolean result = obj.check(n);
            System.out.println(result);
        }
    }
}