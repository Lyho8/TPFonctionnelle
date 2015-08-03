package org.formation.fonctionnelle;
import java.util.Scanner;

public class Fonct1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cylinder properties.");
		
		System.out.println("Enter a radius (cm) : ");
		double r = sc.nextDouble();
		
		System.out.println("Enter a height (cm) : ");
		double h = sc.nextDouble();
		
		sc.close();
		
		double a = r*r*Math.PI;
		double v = a*h;
		
		System.out.println("Area : " + a + " cm^2\nVolume : " + v + " cm^3");
	}

}
