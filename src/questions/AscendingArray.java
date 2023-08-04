package questions;

public class AscendingArray {

	public static void main(String[] args) {
		int []a= {5,9,2,6,1,8,3,7,4,10};
		
		System.out.print("Original array : ");
		for(int i=1; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.print("Array in ascending order : ");
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]> a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
	}

}
