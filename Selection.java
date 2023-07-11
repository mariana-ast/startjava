package sorts;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={3,1,2,7,0,5,4};
		selection2(a);
		
		
		for(int i:a){
			System.out.println(i);
		}
	}
	
	private static void selection1(int[] a){
		for(int j=a.length-1;j>0;j--){
			int max=j;
			for(int i=0;i<j+1;i++){
				if (a[i]>a[max]){
					max=i;
				}
			}
			int m=a[j];
			a[j]=a[max];
			a[max]=m;
		}
	}
	
	private static void selection2(int[] a){
		for(int i=0;i<a.length-1;i++){
			int min=i;
			for (int j=i+1;j<a.length;j++){
				if (a[j]<a[min]){
					min=j;
				}
			}
			int m=a[i];
			a[i]=a[min];
			a[min]=m;
		}
		
	}
}
