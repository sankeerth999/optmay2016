package com.assignment.july9;

import java.util.Random;
import java.util.Scanner;

public class VehicleTest {

	public static void main(String[] args) {
		
		Vehicle<String> v1 = new Vehicle<String>("x", "y", "z");
		Scanner sc = new Scanner( System.in );
		System.out.println("Enter your Vehicle make: ");
		String x1 = sc.nextLine();
		v1.setMake(x1);
		System.out.println("Enter you vehicle model: ");
		String x2 = sc.nextLine();
		v1.setModel(x2);
		System.out.println("Enter the chassis number of your vehicle: ");
		String x3 = sc.nextLine();
		v1.setChassis(x3.toUpperCase());
		Random rand = new Random();
		int registrationNumber = rand.nextInt(9999) + 1;
		System.out.println("Your vehicle is " + v1.getMake() 
		+ " of model " + v1.getModel() + ". \nWith a chassis number of "
		+ v1.getChassis() + ". \nIs registered with a number: TS 10 AS " + registrationNumber);
		sc.close();
	}

}
