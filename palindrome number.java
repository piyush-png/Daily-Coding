import java.util.*;

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int n = x;
        int temp = 0;
        while (n > 0) {
            temp = temp * 10 + n % 10;
            n = n / 10;
        }
        return (temp == x);
    }

    public static void main(String[] args) { // Required for VS Code
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PalindromeNumber obj = new PalindromeNumber();
        boolean r = obj.isPalindrome(n);
        if (r)
            System.out.print("true");
        else
            System.out.print("false");
    }
}
