package tpju.course;

import java.util.ArrayList;
/**
 * Classe Participant
 *
 * @author Akram - Ayoub
 * @version 2.0
 */
public class Conducteur extends Participant
{
    ArrayList<Vehicule> voitures;
    public Conducteur()
    {
        nom = "inconu";
        this.numTel = "";
        id="";
        titres = 0;
        voitures = new ArrayList<Vehicule>();
    }
    
    public Conducteur(String nom, String numTel)
    {
        this.nom = nom;
        this.numTel = numTel;
        this.voitures = new ArrayList<Vehicule>();
        this.id = nom+numTel; 
    }

}
