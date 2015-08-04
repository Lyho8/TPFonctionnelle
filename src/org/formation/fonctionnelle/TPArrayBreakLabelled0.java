package org.formation.fonctionnelle;

import java.util.Scanner;

public class TPArrayBreakLabelled0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] t = {32,87,3,589,12,1076,2000,8,622,127};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a integer : ");
		int n = sc.nextInt();
		
		sc.close();
		
		for(int tmp: t){
			if(n==tmp){
				System.out.println(n + " est contenu dans le tableau !");
				break;
			}
			else{
				if(tmp!=127){
					continue;
				}
			}
			System.out.println(n + " n'est pas contenu dans le tableau !");
		}
		
	}

}
