package sorts;

public class Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={3,1,2,7,0,5,7,4};
		counting(a);
		
		for(int i:a){
			System.out.println(i);
		}
	}
	
	private static void counting(int[] a){
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]<min){
				min=a[i];
			}
			if(a[i]>max){
				max=a[i];
			}
		}
		int[] vector=new int[max-min+1];
		for(int i=0;i<a.length;i++){
			vector[a[i]-min]++;
		}
		for(int i=0;i<a.length;i++){
			a[i]=0;
		}
		int count_old=vector[0];
		for(int i=0;i<vector.length;i++){
			int count=vector[i];
			
			for(int j=0;j<count;j++){
				a[i+j+count_old-1]=i+min;
			}
			count_old=count;	
		}
		
	}
}
