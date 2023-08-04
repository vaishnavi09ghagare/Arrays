package questions;

public class AllNegativeElements {

	public static void main(String[] args) {
		int []a= {1,-5,7,2,-18,-9,-4,10};
		int count=0;
		
		System.out.print("List of negative elements in an array :");
		
		while(count< a.length) {
			if(a[count]<0) {
				System.out.print(a[count]+" ");
			}
			count++;
		}
	}

}
