package tpju.course;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

//import cucumber.api.PendingException;  
import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;  

public class AddVoiture {
      Participant p;
      Voiture v;
      
	  @Given("Un participant <nom> qui s'enregistre")
	  public void participant_senregistre(String nom) {
		  p=new Participant();
		  p.setNom(nom);
	  }
	  @When("s'atribue la voiture <nom> et <vitesse>")
	  public void une_voiture_est_enregistree(String nom, int vitesse) {
	      v.setModele(nom);
	      v.setVitesseMax(vitesse);
	      p.addVoiture(v);
	  }
	  @Then("Verifier si elle est affectee")
	  public void verif_depasse_vitesse() {
	      assertTrue(p.getVoitures().contains(v));
	  }
}
