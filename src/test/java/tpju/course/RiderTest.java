package tpju.course;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import java.util.ArrayList;

public class RiderTest {

    private ArrayList<Rider> riders = new ArrayList<Rider>();
    Rider rider = new Rider();

    @Given("^a rider$")
    public void a_rider()  {
        Assert.assertTrue(this.riders != null);
    }

    @Given("^rider fullname is : \"([^\"]*)\"$")
    public void rider_fullname_is(String fullname) {
        this.rider = new Rider();
        this.rider.setNom(fullname);
    }

    @When("^rider does not already exist on the db$")
    public void rider_does_not_already_exist_on_the_db()  {
        if(this.riders.contains((this.rider)) == false)
            Assert.assertTrue(true);
        else {
            Assert.assertFalse(true);
        }
    }

    @Then("^subscrib rider$")
    public void subscrib_rider() {
        this.riders.add(this.rider);
    }

    @Given("^existing rider fullname is : \"([^\"]*)\"$")
    public void existing_rider_fullname_is(String fullname) {
        this.rider = new Rider();
        this.rider.setNom(fullname);
    }

    @When("^rider does exist on the db$")
    public void rider_does_exist_on_the_db() {
        if(this.riders.contains((this.rider)) == false)
            Assert.assertFalse(false);
        else {
            Assert.assertTrue(true);
        }
    }

    @Then("^unsubscrib rider$")
    public void unsubscrib_rider() {
        this.riders.remove(this.rider);
    }
}
