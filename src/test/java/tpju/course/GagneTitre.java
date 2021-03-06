package tpju.course;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GagneTitre {
	
    Voiture v1;
    Conducteur p1;
    CourseVoiture c1;
    int AncienNbTitre;


    @Given("un enrgesitrement d une course et participant et nombre de titres")
    public void enregistre_participant_et_voiture() {
    	 v1 = new Voiture();
    	 c1 = new CourseVoiture();
    	 p1= new Conducteur();
    	  v1.setModele("Audi A7");
          v1.setVitesseMax(260);

          p1.setNom("Thomas");
          
          c1.ajouterPartcipant(p1);
          
        
        
        
    }
    @When("le participant p gagne la course c")
    public void gagne_course() {
      	AncienNbTitre = p1.getTitres();
        c1.gagnant(p1);

    }
    @Then("verifier l'incrementation des tritres de p")
    public void titre_attribue() {        
        assertTrue(AncienNbTitre+1 == p1.getTitres());
    }
}
