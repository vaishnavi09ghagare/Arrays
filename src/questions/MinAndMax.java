package questions;

public class MinAndMax {

	public static void main(String[] args) {
		int []n= {10,15,20,25,30,50,80};
		int min=Integer.MIN_VALUE;
		int max=Integer.MAX_VALUE;
		
		for(int i=0; i<n.length;i++) {
			int temp=n[i];
			
			if(temp<min) {
				min=temp;
			}
			if(temp>max) {
				max=temp;
			}
			
		}
		System.out.print("min"+min+" ");
		System.out.println();
		System.out.print("max"+max+" ");
		
	}

}
