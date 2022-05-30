import java.lang.Math;

class PalindromeNumber {
    public static void main(String... args) {
        boolean palindrome = isPalindrome(123321);

        System.out.printf("%s%n", palindrome);
    }

    static boolean isPalindrome(int number) {
        String check = Integer.toString(number);

        int length = check.length();
        if (length <= 1) return true;

        int center = (int) Math.ceil(length / 2);

        for (int i = 0; i < center; i++) {
            if (check.charAt(i) != check.charAt(length - 1 - i)) return false;
        }

        return true;
    }
}
