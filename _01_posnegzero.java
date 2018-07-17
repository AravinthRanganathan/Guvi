package codekata_Beginner;

import java.util.Scanner;

public class _01_posnegzero {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("Positive");
		}
		if(a<0) {
			System.out.println("Negative");
		}
		if(a==0) {
			System.out.println("Zero");
		}
	}
}
