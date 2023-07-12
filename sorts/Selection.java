package sorts;

public class Selection {

	public static void sorting1(int[] a){
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
	
	public static void sorting2(int[] a){
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
