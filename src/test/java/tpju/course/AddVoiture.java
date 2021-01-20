package tpju.course;
import static org.junit.Assert.assertTrue;

//import cucumber.api.PendingException;  
import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;  

public class AddVoiture {
      Conducteur p;
      Voiture v;
      
	  @Given("^Un participant \"([^\"]*)\" qui s enregistre$")
	  public void participant_senregistre(String nom) {
		  p=new Conducteur();
		  p.setNom(nom);
	  }
	  @When("^Il s attribue la voiture avec le nom \"([^\"]*)\" et la vitesse \"([^\"]*)\"$")
	  public void une_voiture_est_enregistree(String nom1, String vitesse) {
		  v=new Voiture(nom1,Integer.parseInt(vitesse));
		  v.setModele(nom1);
	      v.setVitesseMax(Integer.parseInt(vitesse));
	      p.addVehicule(v);
	  }
	  @Then("Verifier si elle est affectee")
	  public void verif_affectee() {
	      assertTrue(p.getVehicule().contains(v));
	  }
}
