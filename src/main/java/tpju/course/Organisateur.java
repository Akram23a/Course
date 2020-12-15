package tpju.course;

public class Organisateur {
	
		String nom;
		String numTel;
		
		public Organisateur(String nom, String numTel) {
			this.nom = nom;
			this.numTel = numTel;
		}
		public Organisateur(Organisateur org) {
			this.nom = org.nom;
			this.numTel = org.numTel;
		}
}
