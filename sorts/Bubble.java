package sorts;

public class Bubble {
		
	public static void sorting(int[] a){
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
