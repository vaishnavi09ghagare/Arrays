package questions;

public class EvenAndOdd {

	public static void main(String[] args) {
		int []n= {1,2,3,4,5,6,7,8,9,10};
		//to print odd number
		System.out.print("Odd Numbers : ");
		for( int i=0; i<n.length;i++) {
			if(n[i] %2 != 0) {
				System.out.print(n[i]+" ");
			}
		}
		
		System.out.println();
		
		//to print even numbers
		System.out.print("Even Numbers : ");
		for(int i=0;i<n.length;i++) {
			if(n[i] % 2 == 0) {
				System.out.print(n[i]+" ");
			}
		}
	}

}
