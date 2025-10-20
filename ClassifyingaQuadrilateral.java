package com.codegnan.controlstatements;
import java.util.*;

public class ClassifyingaQuadrilateral {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter sides a,b,c,d");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		if(a==b && b==c && c==d) {
			System.out.println("Square");
		}else{
			if(a==c && b==d) {
				System.out.println("Rectangle");
			}else {
				System.out.println("other");
			}
		}
		s.close();
	}

}
