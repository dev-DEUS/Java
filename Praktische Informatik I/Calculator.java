
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

    public static int pow(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 2));
    }
}
