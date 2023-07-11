import java.util.Scanner;
import sorts.*;

public class Intro{

	public static void main(String[] args){
		Scanner console=new Scanner(System.in,"cp866");
		System.out.print("Введите свое имя:");
		System.out.println(console.nextLine());
		System.out.println("Добро пожаловать в мою программу!");
		int[] a={3,1,2,7,0,5,7,4};
		Bubble.sorting(a);
		
		
		for(int i:a){
			System.out.println(i);
		}
	
}