
package questions;

public class EandOtwoSeparateArray {
	
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9,10};
		System.out.print("Array : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//to print even numbers
		System.out.print("Even elements in array : ");
		for(int i=0;i<a.length;i++) {
			if(a[i] % 2 == 0) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		//to print odd numbers
		System.out.print("Odd elements in an array : ");
		for(int i=0;i<a.length;i++) {
			if(a[i] % 2 == 1) {
				System.out.print(a[i]+" ");
			}
		}
	}

}
