package org.formation.fonctionnelle;

public class StringvsBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String lievre;
		String tortue = "";
		
		//Concaténation
		long start = System.currentTimeMillis();
		
		for(int i = 0;i<10000;i++){
			tortue+=" "+i;
		}
		
		long end = System.currentTimeMillis();
		
		long time = end-start;
		System.out.println("Tortue : ~" + time + " ms");
		
		//StringBuilder
		start = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<10000;i++){
			sb.append(" ");
			sb.append(i);
		}
		lievre = sb.toString();
		
		end = System.currentTimeMillis();
		
		time = end-start;
		System.out.println("Lièvre : ~" + time + " ms");
		
		//Vérification
		if(tortue.equals(lievre)){
			System.out.println("Lièvre = Tortue");
		}
		else{
			System.out.println("Lièvre != Tortue");
		}

	}

}
