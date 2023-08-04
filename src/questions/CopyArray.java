package questions;

public class CopyArray {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9};
		int []b=new int[a.length];
		b=a;
		//b[0]++;
		
		System.out.print("Array 1 : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.print("Array 2 : ");
		for(int i=0; i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}

}
