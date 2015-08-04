package org.formation.fonctionnelle;

public class FonctProblemeAdresses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] adr = {
				"blah@gmail.com",
				"blahblah@laposte.net",
				"blahblah@yahoo.fr",
				"blablahblahblahblahblahh@gmail.com",
				"blahblah@facebook.com",
				"blah@dta.com",
				"blahblahblah@free.fr",
				"b@gmail.com",
				"blahblahblahblahblah@free.fr",
				"blahblah@laposte.net"
		};
		
		int ind=0;
		String[] listeFournisseurs = new String[10];
		int[] compteurFournisseurs = new int[10];
		
		for(int i=0;i<10;i++){
			ind = adr[i].indexOf('@');
			String tmp = adr[i].substring(ind+1);
			
			for(int j=0;j<10;j++){
				if(tmp.equals(listeFournisseurs[j])){
					compteurFournisseurs[j]++;
					break;
				}
				
				if(j==9){
					int k = 0;
					while(compteurFournisseurs[k]!=0){
						k++;
					}
					listeFournisseurs[k] = tmp;
					compteurFournisseurs[k]++;
				}
			}
		}
		
		int k = 0;
		double ratio = 0.0;
		while(compteurFournisseurs[k]!=0){
			ratio = compteurFournisseurs[k]/10.0;
			System.out.println("Le fournisseur " + listeFournisseurs[k] + " détient " + ratio*100 + "% du marché sur la population enregistrée.");
			k++;
			if(k==10){
				break;
			}
		}
		
		
	}

}
