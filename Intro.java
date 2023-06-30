import java.util.Scanner;

public class Intro{

	public static void main(String[] args){
		Scanner console=new Scanner(System.in,"cp866");
		System.out.print("Введите свое имя:");
		System.out.println(console.nextLine());
		System.out.println("Добро пожаловать в мою программу!");
	}
	
}