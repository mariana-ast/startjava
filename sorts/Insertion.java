package sorts;

public class Insertion {
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={3,1,2,7,0,5,7,4};
		sorting2(a);
		
		for(int i:a){
			System.out.println(i);
		}
	}*/

	public static void sorting(int[] a){
		for(int i=1;i<a.length;i++){
			int cur=a[i];
			int j=i-1;
			while (cur<a[j] && j>=0){
				int m=a[j];
				a[j]=a[j+1];
				a[j+1]=m;
				if (j>0)
					j--;
			}
		}
	}

	public static void sorting2(int[] a){
		for(int i=1;i<a.length;i++){
			int cur=a[i];
			int j=i-1;
			while(j>=0 && a[j]>cur){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=cur;
		}
	}
	
}
