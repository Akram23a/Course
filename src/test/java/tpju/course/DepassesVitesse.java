package tpju.course;


import static org.junit.Assert.assertEquals;

//import cucumber.api.PendingException;  
import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;  

public class DepassesVitesse {
	
    Voiture testV;

    @Given("Un participant qui enregistre sa voiture")
    public void participant_senregistre(int vitesseMax, int vitesse) {
    	testV = new Voiture();
    }
    @When("la vitesse <v> est entree")
    public void une_voiture_est_enregistree(int v) {
    	testV.setVitesseMax(250);
    }
    @Then("Verifier si elle depasse la vitesse <c>")
    public void there_is_no_cocktail_in_the_order(int c) {
        assertEquals(true, testV.depasseVitesse(c));
    }
}