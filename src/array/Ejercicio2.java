package array;

import java.util.Arrays;

public class Ejercicio2 {

	public void show() {

		int[] array = { 3, 4, 5, 6, 7, 8 };
		int[] arrayinv = new int[array.length];

		int pos = array.length - 1; //inicializa desde el ultimo

		invArray(array, arrayinv, pos);
	}

	public void invArray(int[] array, int[] arrayinv, int pos) {

		for (int i = 0; i < array.length; i++) {
			arrayinv[i] = array[pos]; // comienza la iteracion desde pos (ultimo) 

			pos--;
		}

		System.out.println(Arrays.toString(arrayinv));
	}

	public static void main(String[] args) {

		new Ejercicio2().show();

	}
}