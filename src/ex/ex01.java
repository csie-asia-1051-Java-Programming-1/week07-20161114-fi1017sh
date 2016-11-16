package ex;

import java.util.Scanner;

/*
 * Date: 2016/11/14
 * Author: 105021009 陳俞儒
 */
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入欲輸入數值之總個數:");
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println("請輸入數值:");
		int m=scn.nextInt();
		fun(n);
		
	}
	public static void fun(int n){
		int [ ] data = new int [n];
		int a = 0;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		for(int i=0;i<=n;i++){
			a=a+data[i];
			a=a/n;
		}
		for(int j=0;j<=n;j++){
			sum1=data[j]-a;
			sum2=sum1*sum1;
			sum3=sum2+sum2;
		}
		System.out.println(sum3/n);
	}
}
