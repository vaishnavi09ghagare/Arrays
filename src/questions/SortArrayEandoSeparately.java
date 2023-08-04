package questions;

public class SortArrayEandoSeparately {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9};
		System.out.print("Original Array : ");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i] +" ");
		}
		//to sort array in ascending and descending
		System.out.println();
		System.out.print("Soterd Array of elemets Even and Odd : ");
		for(int i=0;i<a.length;i++) {
			if(a[i] % 2 == 0) {
				System.out.print(a[i]+" ");
			}
		}
		
		for(int j=0;j<a.length;j++) {
			if(a[j] % 2 == 1) {
				System.out.print(a[j]+" ");
			}
		}
	
	}

}
