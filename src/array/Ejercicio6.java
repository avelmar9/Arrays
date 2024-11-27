package array;

import java.util.Arrays;

public class Ejercicio6 {

	public void show() {
		int[][] num = { { 1, 3 }, { 3, 4, 6 } };
		int[][] num2 = copy(num);

	}

	public int[][] copy(int[][] num) {

		int[][] copy = new int[num.length][]; //creacion de nuevo array

		for (int i = 0; i < num.length; i++) { //iterar fila

			copy[i] = Arrays.copyOf(num[i], num[i].length * 2);//duplicar columnas
		}
		System.out.println(Arrays.deepToString(copy));
		return copy;

	}

	public static void main(String[] args) {

		new Ejercicio6().show();
	}

}
