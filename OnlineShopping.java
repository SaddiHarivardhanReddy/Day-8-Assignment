package com.codegnan.controlstatements;

import java.util.Scanner;

public class OnlineShopping {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Total amount");
	double totalAmount=s.nextDouble();
	double discount;
	double festivalDiscount;
	double membershipDiscount;
	System.out.println("Is this a festival season(yes/no)");
	boolean festivalSeason=s.next().equalsIgnoreCase("yes");
	System.out.println("Do you have premium membership(yes/no)");
	boolean isMember=s.next().equalsIgnoreCase("yes");
	if(totalAmount>=10000) {
		discount=totalAmount*0.2;
		totalAmount-=discount;
		System.out.println("Discount Applies: "+discount);
	}else {
		if(totalAmount>=5000) {
			discount=totalAmount*0.1;
			totalAmount-=discount;
			System.out.println("Discount Applies: "+discount);
		}
		else {
			System.out.println("no regular discount applied");
		}
	}
	if(festivalSeason) {
		festivalDiscount=totalAmount*0.05;
		totalAmount-=festivalDiscount;
		System.out.println("Festival Discount applied: "+festivalDiscount);
	}
	if(isMember) {
		membershipDiscount=totalAmount-200;
		totalAmount=membershipDiscount;
		System.out.println("membership Discount 200 applied");
	}
	System.out.println("Final amount to be paid: "+totalAmount);
	s.close();
	}

}
