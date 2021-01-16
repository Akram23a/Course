package tpju.course;
import static org.junit.Assert.assertTrue;

//import cucumber.api.PendingException;  
import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;  

public class AddVoi {
      Participant p;
      Voiture v;
      
	  @Given("^Un participant \"([^\"]*)\" qui s enregistre$")
	  public void participant_senregistre(String nom) {
		  p=new Participant();
		  p.setNom(nom);
	  }
	  @When("^Il s attribue la voiture avec le nom \"([^\"]*)\" et la vitesse \"([^\"]*)\"$")
	  public void une_voiture_est_enregistree(String nom, String vitesse) {
	      v = new Voiture();
		  v.setModele(nom);
	      v.setVitesseMax(Integer.parseInt(vitesse));
	      p.addVoiture(v);
	  }
	  @Then("Verifier si elle est affectee")
	  public void verif_depasse_vitesse() {
	      assertTrue(p.getVoitures().contains(v));
	  }
}
