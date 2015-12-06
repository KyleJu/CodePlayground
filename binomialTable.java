public class a{

public static int[][] bc = new int [20+1][20 +1];

public static void main(String[] args) {
	for (int i =0; i <21; i++) {
		bc[i][0] = 1;
	}

	for (int i = 1; i < 21; i++) {
		for (int j = 1; j < 21; j ++) {
			bc[i][j] = bc[i-1][j-1] + bc[i-1][j];
			System.out.print(bc[i][j] + " ");
		}

		System.out.println();

	}

		System.out.println(bc[6][3]);
}
}