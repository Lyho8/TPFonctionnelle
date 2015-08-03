package org.formation.fonctionnelle;

import java.util.Scanner;

public class FonctlPileOuFace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Heads(1) or Tails(0) ? ");
		
		int r = sc.nextInt();
		
		sc.close();
		
		int rand =  (int) (Math.random() * 2);
		
		if(r==rand){
			System.out.println("Won !");
		}
		else{
			System.out.println("Lost !");
		}
		
	}

}
