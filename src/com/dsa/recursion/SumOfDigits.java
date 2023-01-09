package com.dsa.recursion;

public class SumOfDigits {
	
	public static int SOD(int n) {
		if(n==0 || n<0) {
			return 0;
		}
		return n%10+SOD(n/10);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = SumOfDigits.SOD(1111);
		System.out.println("Sum of digits = "+sum);
	}

}
