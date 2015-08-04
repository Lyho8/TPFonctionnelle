package org.formation.fonctionnelle;

import java.util.ArrayList;

public class FonctFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Sans tableau");
		for(int i=1;i<13;i++){
			System.out.print(i + " ");
		}
		
		int[] t = new int[12];
		for(int i=0;i<12;i++){
			t[i] = i+1;
		}
		
		System.out.println("\n\nTableau avec length");
		for(int i=0;i<t.length;i++){
			System.out.print(t[i] + " ");
		}
		
		System.out.println("\n\nTableau avec for each");
		for(int val: t){
			System.out.print(val + " ");
		}
		
		String ville = "Saint-Herblain";
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Reims");
		list.add("Paris");
		list.add("Toulouse");
		list.add("Montpellier");
		list.add("Saint-Herblain");
		list.add("Nantes");
		
		System.out.println("\n\nParcours des villes...");
		for(String city: list){
			System.out.println(city);
			if(city.equals(ville)){
				System.out.println("C'est ma ville préférée !");
			}
		}
		
	}

}
