package com.codegnan.controlstatements;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter age");
		int age=s.nextInt();
		System.out.println("Enter number of units consumed");
		double units=s.nextDouble();
		double discount;
		double bill;
		if(units>0 && units<=100) {
			bill=units*1.50;
		}else {
			if(units>100 && units<=200) {
				bill=units*2.00;
			}else {
				if(units>=201 && units<=300) {
					bill =units*3.00;
				}else {
					bill=units*5.00;
				}
			}
		}
		if(bill>1000 && age>65) {
			discount=bill*0.15;
			bill-=discount;
			System.out.println("Discount applied: "+discount);
		}else {
			if(bill>1000) {
			 discount=bill*0.1;
				bill-=discount;
				System.out.println("Discount applied: "+discount);
			}
		}
		System.out.println("the total electricity bill is: "+bill);
		s.close();
	}
}
