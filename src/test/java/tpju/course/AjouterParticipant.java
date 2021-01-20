package tpju.course;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AjouterParticipant {
	
	CourseFactory factory;
	
	CourseVoiture courseVoiture;
	Conducteur c;
	Voiture v;
    
	
	@Given("^Un participant s enregistre avec le nom \"([^\"]*)\" et la vitesse \"([^\"]*)\"$")
	  public void voiture_enregistree(String nomvoiture, String vitesse) {
		v = new Voiture(nomvoiture, Integer.parseInt(vitesse));
	  }
	  @When("^on cree a la course$")
	  public void creer_course_voiture() {
		  factory= new CourseFactory();
		  courseVoiture = (CourseVoiture) factory.getCourse("voiture");
	  }
	  
	  @And("^on ajoute un conducteur \"([^\"]*)\"$")
	  public void ajouter_participant(String nom) {
		  c = new Conducteur(nom, nom);
	  }
	  
	  @And("^on ajoute la voiture cree a la course$")
	  public void ajouter_voiture_a_conducteur() {
		  c.addVehicule(v);
		  v.setProprietaire(c);
	  }
	  @Then("Verifier que le participant a bien ete ajoute")
	  public void verifier_proprietaire() {
		  if(v.getProprietaire()!= null) {
			  assertTrue(true);
		  }else {
			  assertTrue(false);
		  }
	  }
}
