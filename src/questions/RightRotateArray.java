package questions;

public class RightRotateArray {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9,10};	
		System.out.print("Original Array : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		int n=3,j,last;
		for(int i=0;i<n;i++) {
			last=a[a.length-1];
			for(j= a.length-1;j>0; j--) {
				a[j]=a[j-1];
			}
			a[0]=last;
		}
		System.out.println();
		
		System.out.print("Array After Rotation : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	
	
	}

}
