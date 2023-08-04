package questions;

public class PrintDuplicateElement {

	public static void main(String[] args) {
		int []a= {1,2,4,5,2,3,5,4};
		
		System.out.print("Original Array : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.print("Duplicate Array : ");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.print(a[j]+" ");
				}
		}
		}
		
	
	}

}
