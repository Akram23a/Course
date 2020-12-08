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

  
    public Participant()
    {
        nom = "inconu";
        voitureChoisie = null;
        voitures = new ArrayList<Voiture>();
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
}
