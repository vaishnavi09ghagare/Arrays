package questions;

public class CountOfNegativeElements {

	public static void main(String[] args) {
		int []n= {9,-5,6,8,-2,-4,-9,-12,20};
		int count=0;
		
		for(int i=0;i<n.length;i++) {
			if(n[i]<0) {
				count++;
			}
		}
		System.out.println("The count of negative number is :"+count);
		
	}

}
