import java.lang.Math;

class PrimeNumber {
    public static void main(String... args) {
        for (int i = 0; i < 100; i++) {
            boolean isPrimeNumber = isPrime(i);

            if (isPrimeNumber) System.out.printf("%d ", i);
        }
        System.out.printf("%n");
    }

    static boolean isPrime(int number) {
        if (number == 0 || number == 1) return false;
        if (number == 2 || number == 3 || number == 5 ||  number == 7) return true;
        if (number < 10) return false;

        long rounded = Math.round(Math.sqrt(number));

        for (int i = 2; i <= rounded; i++) {
            if (number % i == 0) return false;
        }

        return true;
    }
}
