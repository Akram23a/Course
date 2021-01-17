package tpju.course;


import static org.junit.Assert.assertTrue;

//import cucumber.api.PendingException;  
import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;  

public class DepasseVitesse {
	
    Voiture testV;

    @Given("Un participant qui enregistre sa voiture")
    public void participant_senregistre() {
    	testV = new Voiture();
    }
    @When("^la vitesse \"([^\"]*)\"$")
    public void une_vitesse(String v) {
    	testV.setVitesseMax(Integer.parseInt(v));
    }
    @Then("^Verifier si elle depasse la vitesse \"([^\"]*)\"$")
    public void verif_depasse_vitesse(String c) {
        assertTrue(testV.depasseVitesse(Integer.parseInt(c)));
    }
}