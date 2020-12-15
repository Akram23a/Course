package tpju.course;

import java.util.ArrayList;
/**
 * Classe Participant
 *
 * @author Akram - Ayoub
 * @version 2.0
 */
public class Participant
{
    private String nom;
    private Voiture voitureChoisie;
    ArrayList<Voiture> voitures;
    private String numTel;
    private String id="";
    private int titre = 0;

    public Participant()
    {
        nom = "inconu";
  
        voitureChoisie = null;
        voitures = new ArrayList<Voiture>();
    }
    public Participant(String nom, String numTel)
    {
        this.nom = nom;
        this.numTel = numTel;
        voitureChoisie = null;
        voitures = new ArrayList<Voiture>();
        setId(this.nom+this.numTel); 
    }

       public String getNom()
    {
        return this.nom;
    }
 
    public Voiture getVoiture()
    {
        return this.voitureChoisie;
    }
 
    public void setVoitureChoisie(Voiture newVoiture)
    {
        this.voitureChoisie = newVoiture;
    }
 
    public void setNom(String newNom)
    {
        this.nom = newNom;
    }
    
    public ArrayList<Voiture> getVoitures(){
    	return this.voitures;
    }
    
    public void addVoiture(Voiture v) {

    	this.voitures.add(v);
    	v.setProprietaire(this);
    }
    
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getNumTel() {
		return numTel;
	}	
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public int getTitre() {
		return titre;
	}
	public void setTitre(int titre) {
		this.titre = titre;
	}
}
