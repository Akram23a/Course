package tpju.course;

//import junit.framework.TestCase;

/**
 * Classe Voiture
 *
 * @author Akram, Ayoub
 * @version 2.0
 */
public class Voiture
{
    private String modele;
    private int vitesseMax; 
    private Participant proprietaire;
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
    }
    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @return     les informations de la voiture
     */
    public String infosVoiture()
    {
        return "Modele : "+this.modele+
                " Vitesse maximale : "+this.vitesseMax; 
    }
  
    public boolean depasseVitesse(int vitesse)
    {
        if(this.vitesseMax >= vitesse)
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
    public void setProprietaire(Participant newProp)
    {
        this.proprietaire = newProp;
        newProp.setVoitureChoisie(this);
    }
   
    public Participant getProprietaire()
    {
        return this.proprietaire;
    }
    public static void main ( String [] args) {
    	
    	
    	
    }
    
}
