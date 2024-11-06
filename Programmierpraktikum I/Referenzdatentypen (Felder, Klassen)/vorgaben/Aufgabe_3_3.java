
public class Aufgabe_3_3 {

    public static void main(String[] args) {
		int N = 11;
		char[][] matrix = new char[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == 0 || j % 10 == 0 || i == 10) {
					matrix[i][j] = '*';
					System.out.print(matrix[i][j]);
				} else if ((i < 5 && j < 5) || (i > 5 && j > 5)) {
					matrix[i][j] = '.';
					System.out.print(matrix[i][j]);
				} else if ((j == 5) && (i < 5 || i > 5)) {
					matrix[i][j] = '|';
					System.out.print(matrix[i][j]);
				} else if ((i < 5 && j > 5) || (i > 5 && j < 5)) {
					matrix[i][j] = '+';
					System.out.print(matrix[i][j]);
				} else if (i == 5) {
					matrix[i][j] = '-';
					System.out.print(matrix[i][j]);
				}
			}
			System.out.println();
		}

	}

}
