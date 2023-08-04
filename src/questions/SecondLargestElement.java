package questions;

public class SecondLargestElement {

	public static void main(String[] args) {
		int []n= {10,40,30,60,70,90};
		System.out.println("The second largest element is:"+lagrgestEle(n));
	}

	private static int lagrgestEle(int[] n) {

		int temp ;
		for(int i=0; i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				if(n[i]>n[j]) {
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
		}
		return n[n.length-2];
	}

}
