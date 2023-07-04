package sorts;

public class Bubble {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={3,1,2,7,0,5,7,4};
		sorting(a);
		
		
		for(int i:a){
			System.out.println(i);
		}
	}
	
	private static void sorting(int[] a){
		for(int i=0;i<a.length;i++)
			for(int j=1;j<a.length-i;j++){
				if(a[j-1]>a[j]){
					int m=a[j];
					a[j]=a[j-1];
					a[j-1]=m;
				}
			}
	}
}
