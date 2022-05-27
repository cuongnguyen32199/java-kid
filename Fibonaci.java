public class FirstClass {
    public static void main(String... args) {
        int a = 0, b = 1, c, limit = 10;
        System.out.print(a + " " + b);

        for (int i = 2; i < limit; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }

        System.out.printf("%n");
    }
}

public class SecondClass {
    static int a = 0, b = 1, c;

    public static void main(String... args) {
        int limit = 10;
        System.out.printf("%d %d", a, b);
        fibonaci(limit - 2);
        System.out.printf("%n");
    }

    static void fibonaci(int limit) {
        if (limit == 0) return;

        c = a + b;
        a = b;
        b = c;
        System.out.printf(" %d", c);
        fibonaci(limit - 1);
    }
}
