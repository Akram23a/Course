package tpju.course;


public class Voiture extends Vehicule {
    

    public Voiture()
    {
        super();

    }
    public Voiture(String nom, int vit)
    { 
    	super(nom,vit);
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
    	if(!(obj instanceof Object))
    		return false;
    	Voiture v1 = (Voiture)obj;
    	Voiture v2 = (Voiture)obj;
    	return v1.getModele().equals(getModele())
                && getVitesseMax() == v2.getVitesseMax();

    }
 

  
    
}
