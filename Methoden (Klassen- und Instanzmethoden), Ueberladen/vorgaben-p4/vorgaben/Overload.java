
public class Overload {

    public static String concat(String s1, String s2) {
        return s1 + s2;
    }

    public static String concat(int n, String s) {
        String temp = "";
        for (int i = 1; i <= n; i++) {
            temp += s;
        }
        return temp;
    }

    public static String concat(String[] s, char c) {
        String temp = "";
        for (int i = 0; i < s.length; i++) {
            if (i < s.length - 1) {
                temp += s[i];
                temp += c;
            } else {
                temp += s[i];
            }
        }
        return temp;
    }

    // 1.5
    public static void main(String[] args) {
        String s1 = "a", s2 = "b", s3 = "c";
        char c = '-';

        // abcabcabc
        // System.out.println(concat(3, s1 + s2 + s3)); <- Mit + Operator
        System.out.println(concat(3, concat(concat(s1, s2), s3)));

        // abbccc
        // System.out.println(concat(1, s1) + concat(2, s2) + concat(3, s3)); <- Mit +
        // Operator
        System.out.println(concat(concat(concat(1, s1), concat(2, s2)), concat(3, s3)));

        // aaa-bbb-ccc
        // String[] testFeld = new String[]{concat(3, s1), concat(3, s2), concat(3, s3)};
        // System.out.println(concat(testFeld, c));
        System.out.println(concat(new String[] { concat(3, s1), concat(3, s2), concat(3, s3) }, c));

    }

}
