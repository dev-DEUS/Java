// Aufgabe 5
public class Rechnen {
    public static int abs(int n) {
        return Math.abs(n);
    }

    public static int neg(int n) {
        return n * -1;
    }

    public static int sqr(int n) {
        return (int) Math.pow(n, 2);
    }

    public static int pow(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static double harmSum(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static long fak(long n) {
        int sum = 1; 
        for (long i = n; i > 0; i--) {
            sum *= i;
        }

        if (sum > Integer.MAX_VALUE) {
            return sum;
        } else {
            return (int) sum;
        }
    }

    public static int max(int[] n) {
        int max = 0; 
        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            } 
        }
        return max;
    }
}
