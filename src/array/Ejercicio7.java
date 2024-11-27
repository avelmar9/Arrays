package array;

public class Ejercicio7 {
	public void show() {
		int[][] num = { { 8, 2 }, { 3, 6 } };

		suma(num);

	}

	public void suma(int[][] num) {

		for (int i = 0; i < num.length; i++) {
			int sumi = 0; //inicializo aqui para reiniciar la suma en cada fila y columna
			int sumj = 0;
			for (int j = 0; j < num[i].length; j++) {
				sumi += num[i][j];
				sumj += num[j][i];
			}
			System.out.println("suma fila:" + sumi);
			System.out.println("suma columna:" + sumj);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ejercicio7().show();
	}

}