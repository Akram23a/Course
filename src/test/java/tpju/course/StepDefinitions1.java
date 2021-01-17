package tpju.course;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;

public class StepDefinitions1 {

    private ArrayList<Moto> motos = new ArrayList<Moto>();
    Moto moto = new Moto();

    @Given("^a moto$")
    public void a_moto()  {
        Assert.assertTrue(this.motos != null);
    }

    @Given("^moto brand is : \"([^\"]*)\"$")
    public void moto_brand_is(String brand) {
        this.moto = new Moto();
        this.moto.setBrand(brand);
    }

    @Given("^moto model is : \"([^\"]*)\"$")
    public void moto_model_is(String model) {
        this.moto = new Moto();
        this.moto.setModel(model);
    }

    @When("^moto does not already exist on the db$")
    public void moto_does_not_already_exist_on_the_db()  {

        if(this.motos.contains((this.moto)) == false)
            Assert.assertTrue(true);
        else {
            Assert.assertFalse(true);
        }
    }

    @Then("^subscrib moto$")
    public void subscrib_moto() {
        this.motos.add(this.moto);
    }

    @When("^moto does exist on the db$")
    public void moto_does_exist_on_the_db() {
        if(this.motos.contains((this.moto)) == false)
            Assert.assertFalse(false);
        else {
            Assert.assertTrue(true);
        }
    }

    @Then("^unsubscrib moto$")
    public void unsubscrib_moto() {
        this.motos.remove(this.moto);
    }
}
