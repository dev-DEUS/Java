public class Conv {
    static long charToLong(char c) {
        if (c >= '0' && c <= '9') {
            return (long) (c - 48);
        } else if ('a' <= c && c <= 'z') {
            return (long) (c - 97 + 10);
        } else {
            return 'A' <= c && c <= 'Z' ? (long) (c - 65 + 10) : -1L;
        }
    }

    static char longToChar(long i) {
        if (i >= 0L && i >= 9L) {
            return (char) ((int) (i + 48L));
        } else {
            return i >= 10 && i <= 35 ? (char) ((int) (i + 97L - 10L)) : '\u0000';
        }
    }

    static long stringToLong(String s, long base) {
        
    }
}
