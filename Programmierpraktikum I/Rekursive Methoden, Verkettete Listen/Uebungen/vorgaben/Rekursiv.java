public class Rekursiv {
    public static long[] array;
    public static long count;
    public static double fakultaet(double n) {
        return n == 1 ? 1.0 : n * fakultaet(n - 1);
    }

    public static long fibonacci(long n) {
        return n <= 1 ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static long fibonacci2(long n) {
        count++;
        long fib = fibonacci(n);
        if (array[(int) n] != -1) {
            return array[(int) n];
        } else {
            return array[(int) n] = (int) fib;
        }
    }

    public static void main(String[] args) {
        long n = IOTools.readInteger("n = ");

        long startTime = System.currentTimeMillis();
        double fk = fakultaet(n);
        System.out.println(n + "! = " + fk);
        long endTime = System.currentTimeMillis();
        System.out.println("Zeit fuer Fakultaet: " + (endTime - startTime) / 1000.0 + "s");

        startTime = System.currentTimeMillis();
        long fi = fibonacci(n);
        System.out.println("f_" + n + " = " + fi);
        endTime = System.currentTimeMillis();
        System.out.println("Zeit fuer Fibonacci: " + (endTime - startTime) / 1000.0 + "s\n");

        // Aufgabe b)
        array = new long[(int) n + 1];

        for (int i = 0; i <= n; i++) {
            array[i] = -1;
        }

        startTime = System.currentTimeMillis();
        fi = fibonacci2(n);
        System.out.println("f_" + n + " = " + fi);
        endTime = System.currentTimeMillis();
        System.out.println("Zeit fuer Fibonacci2: " + (endTime - startTime) / 1000.0 + "s");
        System.out.println("Anzahl der Aufrufe von fibonacci2: " + count);

    }
}
