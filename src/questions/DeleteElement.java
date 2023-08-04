package questions;

public class DeleteElement {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };

		// to print array
		System.out.print("Array : ");

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");

			// to delete element
			int ele = 6;
			if (a[i] == ele) {
				for (int j = i; j < a.length - 1; j++) {

					a[j] = a[j + 1];
					System.out.println("Enter element you awnt to remove : " + ele);
				}
				break;
			}
		}

		// array after deletion of element
		System.out.println("Elements after deletion");

		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
