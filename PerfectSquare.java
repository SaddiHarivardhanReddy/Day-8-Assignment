package com.codegnan.controlstatements;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter side of square");
		int n=s.nextInt();
		if(n<0) {
			System.out.println("Negative numbers are nor perferct sqaure");
		}else {
			int sqrt=(int)Math.sqrt(n);
			if(sqrt*sqrt==n) {
				System.out.println(n+" is a perfect square");
			}else {
				System.out.println(n+" is not a perfect square");
			}
		}
		s.close();
	}

}
