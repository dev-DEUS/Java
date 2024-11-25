public class RekMin {

    public static int minimum(int[] feld, int indx) {
        if (indx == 0) {
            return feld[0];
        } else {
            return feld[indx] < minimum(feld, indx - 1) ? feld[indx] : minimum(feld, indx - 1);
        }
    }

    public static void main(String[] args) {
        int N = 15;
        int[] feld = new int[N];

        for (int i = 0; i < feld.length; i++) {
            feld[i] = (int) (Math.random() * 1000) + 1;
            System.out.println(feld[i]);
        }

        System.out.println("Minimum = " + minimum(feld, N - 1));
    }

}
