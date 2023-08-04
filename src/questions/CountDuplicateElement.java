package questions;

public class CountDuplicateElement {

	public static void main(String[] args) {
	int []a= {1,1,2,2,3,3,4,4,6,7,7};
	
	System.out.print("Original Array : ");
	for(int i=0;i<a.length;i++) {
		System.out.print(" "+a[i]);
	}
	System.out.println();
	
	System.out.println("Number of Duplicate Elements :");
	int dupEle=0;
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++) {
			j=j+1;
			dupEle++;
			System.out.println(dupEle+" ");
			
		}
		break;	
	}
	}
}
