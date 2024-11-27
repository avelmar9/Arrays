package array;

public class Ejercicio5 {
	public void show() {
		int[][] num = { { 1, 2, 3 }, { 2, 4, 5 }, { 3, 4, 6 } };

		symetry(num);

	}

	public boolean symetry(int[][] num) {
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < i; j++) {
				if (num[i][j] != num[j][i]) {

					System.out.println("la matriz no es simétrica");
					return false;
				}

			}

		}
		System.out.println("la matriz es simetrica");
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ejercicio5().show();
	}

}
