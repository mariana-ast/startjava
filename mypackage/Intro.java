package mypackage;

import java.util.Scanner;
import java.io.IOException;
import sorts.*;

public class Intro{
	public static String s1="Your name: ";
	public static String s2="Welcome!";
	public static void main(String[] args){
		System.out.print(s1);
		Scanner console=new Scanner(System.in,"cp866");
		System.out.println(console.nextLine());
		System.out.println(s2);
		int[] a={3,1,2,7,0,5,7,4};
		System.out.println("Bubble");
		Bubble.sorting(a);
		for(int i:a){
			System.out.println(i);
		}
		int[] b={9,1,2,7,8,5,0,3};
		System.out.println("Insertion1");
		Insertion.sorting(b);
		for(int i:b){
			System.out.println(i);
		}
		int[] c={6,9,2,0,3,5,8,7};
		System.out.println("Insertion2");
		Insertion.sorting2(c);
		for(int i:c){
			System.out.println(i);
		}
		int[] d={0,4,9,2,3,1,5,6};
		System.out.println("Selection1");
		Selection.sorting1(d);
		for(int i:d){
			System.out.println(i);
		}
		int[] e={5,3,8,0,9,7,2,1};
		System.out.println("Selection2");
		Selection.sorting1(e);
		for(int i:e){
			System.out.println(i);
		}
	}
}