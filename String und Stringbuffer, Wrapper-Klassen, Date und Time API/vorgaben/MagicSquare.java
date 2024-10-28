public class MagicSquare {
    private Integer[][] mSq;
    private int n;

    // 2
    public MagicSquare(String sq) {
        String[] werte = sq.split(",");
        int n = (int) Math.sqrt(werte.length);

        mSq = new Integer[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mSq[i][j] = Integer.valueOf(werte[i * n + j]);
            }
        }

        this.n = n;
    }

    // 1
    public void printSquare() {
        String temp = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp = String.format("%3d ", mSq[i][j]);
                System.out.print(temp);
            }
            System.out.println();
        }
    }

    // 1
    private int sumArr(Integer[] arr) {
        int sumArr = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArr += arr[i].intValue();
        }
        return sumArr; // Dummy Return
    }

    // 3
    public boolean checkSquare() {
        Integer[] arr1 = new Integer[this.n];
        Integer[] arr2 = new Integer[this.n];
        int referenz = 0;

        referenz += sumArr(mSq[0]);

        // Ueberpruefung der Zeilen
        for (int i = 1; i < n; i++) {
            if (referenz != sumArr(mSq[i])) {
                return false;
            }

        }

        // Ueberpruefung der Spalten
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr1[j] = mSq[j][i];
            }
            if (referenz != sumArr(arr1)) {
                return false;
            }
        }

        // Ueberpruefung der diagonalen linken oberen Ecke
        for (int i = 0; i < n; i++) {
            arr1[i] = mSq[i][i];
        }
        if (referenz != sumArr(arr1)) {
            return false;
        }

        // Ueberpruefung der diagonalen rechten oberen Ecke
        for (int i = 0; i < n; i++) {
            arr2[i] = mSq[i][n - 1 - i];
        }
        if (referenz != sumArr(arr2)) {
            return false;
        }

        return true;
    }

    // 2
    public boolean checkSquare2() {
        for (int i = 1; i <= n * n; i++) {
            Integer wert = Integer.valueOf(i);
            boolean found = false;

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (wert.equals(mSq[j][k])) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }
        return true; // Dummy Return
    }

    public static void main(String[] args) {
        String sq1 = "2,7,6,9,5,1,4,3,8";
        String sq2 = "15,10,3,6,4,5,16,9,14,11,2,7,1,8,13,12";
        String sq3 = "1,2,3,4";
        String sq4 = "1,1,1,1,1,1,1,1,1";

        for (String s : new String[] { sq1, sq2, sq3, sq4 }) {
            System.out.println();
            MagicSquare mSq = new MagicSquare(s);
            mSq.printSquare();
            if (mSq.checkSquare() && mSq.checkSquare2()) {
                System.out.println("\n... is a magic square\n");
            } else {
                System.out.println("\n... is NO magic square\n");
            }
        }

    }
}
