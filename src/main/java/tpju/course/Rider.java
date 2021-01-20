package tpju.course;

import java.util.ArrayList;

public class Rider extends Participant{

	
	public Rider()
    {
        this.vehicule = new ArrayList<Vehicule>();
        this.nom = "";
        this.setNumTel("");

    }

    public Rider(String nom, String numTel)
    {
        this.vehicule = new ArrayList<Vehicule>();
        this.nom = nom;
        this.setNumTel(numTel);
  
    }

}
