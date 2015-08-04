package org.formation.fonctionnelle;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = (int) (Math.random()*1000);
		
		Scanner sc = new Scanner(System.in);
		
		int tmp = 0;
		int counter = 0;
		
		do{
			counter++;
			System.out.println("Enter a integer (0-1000) : ");
			tmp = sc.nextInt();
			
			if(tmp<n){
				System.out.println("Bigger !");
			}
			else if(tmp>n){
				System.out.println("Smaller !");
			}
			else{
				System.out.println("Won in " + counter + " attempts !");
			}
		}while(tmp!=n);
		
		
		sc.close();
		
		
	}

}
