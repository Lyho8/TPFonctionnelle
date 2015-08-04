package org.formation.fonctionnelle;

public class StringvsBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String lievre;
		String tortue = "";
		
		//Concat�nation
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
		System.out.println("Li�vre : ~" + time + " ms");
		
		//V�rification
		if(tortue.equals(lievre)){
			System.out.println("Li�vre = Tortue");
		}
		else{
			System.out.println("Li�vre != Tortue");
		}

	}

}
