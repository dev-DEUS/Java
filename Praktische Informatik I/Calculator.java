
public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static float sub(float a, float b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static float mul(float a, float b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static float div(float a, float b) {
        return a / b;
    }

    public static int mod(int a, int b) {
        return a % b;
    }

    public static float mod(float a, float b) {
        return a % b;
    }

    public static int pow(int base, int exp) {
        return exp == 0 ? 1 : (base * pow(base, exp - 1));
    }

    public static int fac(int a) {
        return (a == 0 || a == 1) ? 1 : a * fac(a - 1);
    }

    public static int fib(int i) {
        return (i == 0) ? 0 : (i == 1) ? 1 : fib(i - 2) + fib(i - 1);
    }

    public static int nthPrime(int n) {
        int count = 0;
        int num = 1;
        while (count <= n) {
            num++;
            if (isPrime(num)) {
                count++;
            }
        }
        return num;
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /*
         * System.out.println("Add (int): " + add(24, 6));
         * System.out.println("Add (float): " + add(24f, 6f));
         * System.out.println("Sub (int): " + sub(24, 6));
         * System.out.println("Sub (float): " + sub(24f, 6f));
         * System.out.println("Mul (int): " + mul(24, 6));
         * System.out.println("Mul (float): " + mul(24f, 6f));
         * System.out.println("Div (int): " + div(24, 6));
         * System.out.println("Div (float): " + div(24f, 6f));
         * System.out.println(pow(2, 4));
         * System.out.println(fac(5));
         * System.out.println(fib(6));
         * 
         */

        int a = Integer.parseInt(args[0]);
        String op = args[1];
        int b = args.length > 2 ? Integer.parseInt(args[2]) : 0;

        if (op.equals("+")) {
            System.out.println(add(a, b));
        } else if (op.equals("-")) {
            System.out.println(sub(a, b));
        } else if (op.equals("*")) {
            System.out.println(mul(a, b));
        } else if (op.equals("/")) {
            System.out.println(div(a, b));
        } else if (op.equals("%")) {
            System.out.println(mod(a, b));
        } else if (op.equals("^")) {
            System.out.println(pow(a, b));
        } else if (op.equals("!")) {
            System.out.println(fac(a));
        } else if (op.equals("fib")) {
            System.out.println(fib(a));
        } else if (op.equals("prime")) {
            System.out.println(nthPrime(a));
        } else {
            System.out.println("Invalid operator");
        }

    }
}
