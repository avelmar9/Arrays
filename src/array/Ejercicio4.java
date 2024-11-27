package array;

public class Ejercicio4 {
	public void show() {
		double[][][] array = { { { 3.2, 6.7 }, { 7.2, 8.2 } }, { { 9.4, 1.5 }, { 6.3, 0.2 } } };

		highestnum(array);
	}

	public void highestnum(double[][][] array) {
		double[][][] result = { { { 0, 0 }, { 0, 0 } }, { { 0, 0 }, { 0, 0 } } };

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i][j].length; k++) {

				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ejercicio4().show();
	}

}
