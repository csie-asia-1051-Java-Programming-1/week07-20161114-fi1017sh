package hw;

import java.util.Scanner;

public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		System.out.println(fun(n,m));
	}
	public static int fun(int n,int m){
		int sum1=1;  // n!
		int sum2=1;  // m!
		int sum3=1;  // (n-m)!
		int sum4=1;  // C(n)取(m) 
		for(int i=n;i>0;i--){
			sum1 =sum1*i;
		}
		for(int i=m;i>0;i--){
			sum2 =sum2*i;
		}
		for(int i=n-m;i>0;i--){
			sum3 =sum3*i;
		}
		return sum4=sum1/(sum2*sum3);
	}
	}
