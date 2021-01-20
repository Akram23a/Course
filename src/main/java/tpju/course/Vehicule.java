package tpju.course;

import java.util.ArrayList;

public abstract class Vehicule{

	protected String modele;
	private Participant propietaire;
	protected int vitesseMax;
    private ArrayList<Vehicule> vehiculesPlusRapides;

	
    public Vehicule()
    { 
        this.vitesseMax = 100;
        this.modele = "";
        setVehiculesPlusRapides(new ArrayList<Vehicule>());
    }

    public Vehicule(String modele, int vitesse)
    {
        this.vitesseMax = vitesse;
        this.modele = modele;
        setVehiculesPlusRapides(new ArrayList<Vehicule>());
    }
    
    
	public int getVitesseMax() {
	    return this.vitesseMax;
	}

	public void setVitesseMax(int vitesse) {
	    this.vitesseMax = vitesse;
	}

	public String getModele() {
	    return this.modele;
	}

	public void setModele(String modele) {
	    this.modele = modele;
	}

	public Participant getProprietaire() {
	    return this.propietaire;
	}

	public void setProprietaire(Participant r) {
	    this.propietaire = r;
	}

	
    public void addVehiculePlusRapide(Voiture v) {
    	getVehiculesPlusRapides().add(v);
    }
    
	@Override
	public String toString() {
	    return "Vitesse max : " + this.vitesseMax + " , Modele : " + this.modele;
	}

	public ArrayList<Vehicule> getVehiculesPlusRapides() {
		return vehiculesPlusRapides;
	}

	public void setVehiculesPlusRapides(ArrayList<Vehicule> vehiculesPlusRapides) {
		this.vehiculesPlusRapides = vehiculesPlusRapides;
	}


}
