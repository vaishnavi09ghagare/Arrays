package questions;

public class ReverseArray {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6};
		
		System.out.println("Arrray Before reversing elements: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.println("Array after reversing elements :");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}

}
