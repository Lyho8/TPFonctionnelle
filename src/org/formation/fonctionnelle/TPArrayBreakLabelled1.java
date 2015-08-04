package org.formation.fonctionnelle;

import java.util.Scanner;

public class TPArrayBreakLabelled1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] m = {{32,87,3,589},{12,1076,2000,8},{622,127,77,955}};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer : ");
		int n = sc.nextInt();
		
		sc.close();
		
		boucledeouf:for(int i=0;i<m.length;i++){
			for(int j=0;j<m[i].length;j++){
				if(n==m[i][j]){
					System.out.println(n + " est contenu dans le tableau à l'indice i: " + i + " j: " + j + " !");
					break boucledeouf;
				}
			}

			if(i!=m.length-1){
				continue;
			}
			System.out.println(n + " n'est pas contenu dans le tableau !");
		}
		
	}

}
