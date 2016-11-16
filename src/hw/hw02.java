package hw;

import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun();
	}
	public static void fun(){
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入數字:");
		String test = scn.next();
		System.out.println("為"+test.length()+"位數");
	}
}
