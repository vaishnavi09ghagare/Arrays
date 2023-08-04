package questions;

public class CountFrequencyOfArray {

	public static void main(String[] args) {
		
		int []a= {2,3,2,4,5,4,6,6,6};
		System.out.print("Original Array : ");
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		int i,j,frequency;
		System.out.println("Frequency of Elements : ");
		for( i=0;i<a.length;i++) {
			frequency=1;
			for( j=i+1;j<a.length;j++) {
				if(a[j]==a[i]) {
					frequency++;
			
					i=j-1;
					if(frequency > 1) {
						System.out.println(a[i]+" "+frequency+" ");
					}
				}
			}
			
		}
		
	}

}
