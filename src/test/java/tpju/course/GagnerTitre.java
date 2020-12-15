package tpju.course;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GagnerTitre {
	
    Voiture v;
    Participant p;
    Course c;
    int AncienNbTitre;

    @Given("un enrgesitrement d une course et participant et nombre de titres")
    public void participant_senregistre(int vitesseMax, int vitesse) {
        v.setModele("Audi A7");
        v.setVitesseMax(260);

        p.setNom("Thomas");
        p.setVoitureChoisie(v);
        
        c.ajouterPartcipant(p);
        
        
        
    }
    @When("le participant p gagne la course c")
    public void une_voiture_est_enregistree( ) {
    	AncienNbTitre = p.getTitre();
        c.gagnant(p);
    }
    @Then("verifier l'incrementation des tritres de P")
    public void there_is_no_cocktail_in_the_order(int c) {
        assertTrue(AncienNbTitre+1 == p.getTitre());
    }
}
