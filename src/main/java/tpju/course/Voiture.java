package tpju.course;

import java.util.ArrayList;

//import junit.framework.TestCase;

/**
 * Classe Voiture
 *
 * @author Akram
 * @version 2.0
 */
public class Voiture extends Vehicule
{
    private String modele;
    private int vitesseMax; 
    private Conducteur proprietaire;

    public ArrayList<Voiture> voituresPlusRapides;
    
    
    
    /**
     * Constructeur d'objets de classe Voiture
     */
    public Voiture()
    {
        this.modele = "non specifie";
        this.vitesseMax = 0;
        this.proprietaire = null;
    }
    public Voiture(String nom, int vit)
    {
        this.modele = nom;
        this.vitesseMax = vit;
        this.proprietaire = null;
        voituresPlusRapides = new ArrayList<Voiture>();
    }
    /**
     * 
     *
     * @return     les informations de la voiture
     */
    public String infosVoiture()
    {
        return "Modele : "+this.modele+
                " Vitesse maximale : "+this.vitesseMax; 
    }
    
    public void addVoiturePlusRapide(Voiture v) {
    	voituresPlusRapides.add(v);
    }
  
    public boolean depasseVitesse(int vitesse)
    {
        if(this.vitesseMax <= vitesse)
            return true;
        else
            return false;
            
    }
    public boolean equals(Object obj) {
    	if(obj == null)
    		return false;
    	if(!(obj instanceof Voiture))
    		return false;
    	Voiture v1 = (Voiture)obj;
    	Voiture v2 = (Voiture)obj;
    	return v1.getModele().equals(getModele())
                && getVitesseMax() == v2.getVitesseMax();

    }
    
    public int getVitesseMax()
    {
        return this.vitesseMax;
    }
 
    public String getModele()
    {
        return this.modele;
    }
    
    public void setModele(String newModele)
    {
        this.modele = newModele;
    }
   
    public void setVitesseMax(int newVitesseMax)
    {
        this.vitesseMax = newVitesseMax;
    }
    public void setProprietaire(Conducteur newProp)
    {
        this.proprietaire = newProp;
        newProp.setVoitureChoisie(this);
    }
   
    public Participant getProprietaire()
    {
        return this.proprietaire;
    }
    public String getstr()
    {
        return " , Model : " + this.modele + "Owner " + proprietaire.getNom();
    }
   
    
}
