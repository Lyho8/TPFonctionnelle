package org.formation.fonctionnelle;

import java.util.Scanner;

public class GradeEvaluator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez une note entre 0 et 100");
		
		int r = sc.nextInt();
		
		sc.close();
				
		if(r>=89){
			System.out.println("Vous avez un A");
		}
		else if(r>=79){
			System.out.println("Vous avez un B");
		}
		else if(r>=63){
			System.out.println("Vous avez un C");
		}
		else{
			System.out.println("Vous avez un F");
		}
		
	}

}
