package questions;

public class SumofArray {

	public static void main(String[] args) {
		int sum=0;
		int []arr=new int[] {1,2,3,4,5};
		for(int i=0; i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("sum of array is : "+sum);
	}

}
