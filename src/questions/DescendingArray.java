package questions;

public class DescendingArray {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9};
		System.out.print("Original Array :");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.print("Array in Descending order : ");
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			System.out.print(a[i]+" ");
		}
	}

}
