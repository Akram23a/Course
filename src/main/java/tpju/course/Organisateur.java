package tpju.course;

public class Organisateur {
	
		static String nom;
		static String numTel;
		
		private static Organisateur instance = new Organisateur();

		private Organisateur() {
			Organisateur.nom = "Master";
			Organisateur.numTel = "+33662537583";
		}

		public static Organisateur getInstance() {
			return instance;
		}

		public static void setInstance(Organisateur instance) {
			Organisateur.instance = instance;
		}
}
