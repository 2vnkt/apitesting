package steps;

import org.junit.Assert;

import endpoints.CatFactsEndPoints;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CatFactsSteps {
	
	World world = new World();
	CatFactsEndPoints catFactsEndPoints = new CatFactsEndPoints();
	
	@When("I Call Get Cat Facts API")
	public void iCallGetCatFacts() {
		world.setResponse(catFactsEndPoints.getCatFacts());
	}

	@Then("I see response has {int} status code car api")
	public void iSeeResponseStatusCode(int code) {
		System.out.println("code : " + code);
		catFactsEndPoints.verifyResponseStatusCode(world.getResponse(), code);
	}
	
	@Then("I validate Cat Facts List")
	public void iVerifycatFactsResonseModel() {
			Assert.assertTrue(
					catFactsEndPoints.verifyCatFactsValuesAreAsExpected(world.getResponse()));
	}

}
