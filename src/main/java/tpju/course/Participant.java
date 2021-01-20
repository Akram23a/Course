package tpju.course;

import java.util.ArrayList;

public abstract class Participant{

	protected String nom;
	protected String numTel;
	protected String id;
	protected ArrayList<Vehicule> vehicule;
	public int titres;

	public Participant() {
		
		vehicule = new  ArrayList<Vehicule>();
	}
	public String getNom() {
	    return this.nom;
	}

	public void setNom(String f) {
	    this.nom = f;
	}

	public ArrayList<Vehicule> getVehicule() {
	    return this.vehicule;
	}

	public void setVehicule(ArrayList<Vehicule> m) {
	    this.vehicule = m;
	}

	public void addVehicule(Vehicule m) {
	    this.vehicule.add(m);
	}

	@Override
	public String toString() {
	    return "Rider fullname : " + this.nom;
	}

	public Object getId() {
		return nom+id;
	}

	public int getTitres() {
		return titres;
	}

	public void setTitres(int s) {
		titres+=1;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}


}
