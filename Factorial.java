class Factorial {
    public static void main(String... args) {
        int n = 15;
        int result = 1;

        for (int i = 2; i < n; i++) {
            result *= i;
        }

        System.out.printf("15! is %s %n", result);
    }
}

class FactorialRecursive {
    public static void main(String... args) {
        int result = recursive(10);

        System.out.printf("10! is %s %n", result);
    }

    static int recursive(int number) {
        if (number <= 1) return 1;

        return number * recursive(number - 1);
    }
}
