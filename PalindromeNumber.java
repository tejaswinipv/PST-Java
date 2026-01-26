import java.util.Scanner;

public class PalindromeNumber {

    static int isPalindrome(int n) {
        int original = input1, rev = 0;
        while (input1 > 0) {
            rev = rev * 10 + n % 10;
            input1 = input1 / 10;
        }
        if (original == rev)
            return 2;
        else
            return 1;
    }
}