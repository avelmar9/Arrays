package array;

public class Ejercicio1 {

	public int mult(int[] nums) {
		int multi = 1;
		for (int i : nums) {
			multi *= i;
		}
		return multi;
	}

	public static void main(String[] args) {
		Ejercicio1 ejercicio = new Ejercicio1();
		int[] nums = { 1, 2, 3, 4, 5 };
		System.out.println(ejercicio.mult(nums));
	}
}
