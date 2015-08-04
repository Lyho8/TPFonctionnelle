package org.formation.fonctionnelle;

public class FonctAvanceDoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean b = true;
		int[] t = new int[3];
		int count = 0;
		
		do{
			count++;
			for(int i=0;i<3;i++){
				t[i] = (int) (Math.random()*1000);
			}
			if((t[0]%2==0) && (t[1]%2==0) && (t[2]%2==1)){
				b = false;
			}
		}while(b);
		
		System.out.println("Combinaison pair-pair-impair trouvée en " + count + " essais : (" + t[0] + ", " + t[1] + ", " + t[2] + ").");

	}

}
