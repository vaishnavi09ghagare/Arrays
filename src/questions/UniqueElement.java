package questions;

public class UniqueElement {

	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 5, 6, 6, 8, 8 };

		System.out.print("Original Array : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();

		System.out.print("Unique ELements : ");
		int dupes=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				if (a[i] == a[j]) {
					dupes++;
				
				}
			}
		}
		System.out.print(dupes);
		

	}

}
