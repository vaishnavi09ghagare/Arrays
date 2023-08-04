package questions;

public class LeftRotateArray {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.print("Original Array : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		int n=3,j,first;
		for(int i=0;i<n;i++) {
			first=a[0];
			for( j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
				
			}
			a[j]=first;
			
		}
		System.out.println();
		
		System.out.print("Array after Rotation :");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
