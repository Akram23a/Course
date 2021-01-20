package tpju.course;

import static org.junit.Assert.*;

import org.junit.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FusionTest {

    Participant participant;
    Moto moto;
    
	  @Given("^Un participant \"([^\"]*)\" s enregistre$")
	  public void participant_enregistre(String nom) {
		  participant=new Conducteur();
		  participant.setNom(nom);
	  }
	  @When("^Il s attribue la moto avec le nom \"([^\"]*)\" et la vitesse \"([^\"]*)\"$")
	  public void une_moto_est_enregistree(String nom1, String vitesse) {
		  moto=new Moto(nom1,Integer.parseInt(vitesse));
		  moto.setModele(nom1);
	      moto.setVitesseMax(Integer.parseInt(vitesse));
	      participant.addVehicule(moto);
	  }
	  @Then("Verifier si la moto est affectee")
	  public void verif_moto_affectee() {
	      assertTrue(participant.getVehicule().contains(moto));
	  }
}
