package steps;

import org.eclipse.jetty.http.HttpStatus;

import endpoints.BaseEndPoints;
import env.ApplicationProperties;
import env.Environment;
import io.cucumber.java.en.Given;
import io.restassured.specification.RequestSpecification;
import utils.Constants;

public class CommonSteps {
	ApplicationProperties appProps = Environment.INSTANCE.getApplicationProperties();
	BaseEndPoints baseEndpoint = new BaseEndPoints();

	@Given("Booking API is active")
	public void booking_API_is_available() {
		RequestSpecification rSpec = baseEndpoint.getCommonSpec().basePath("ping");
		baseEndpoint.sendRequest(rSpec, Constants.RequestType.GET_REQUEST, null).then().statusCode(HttpStatus.CREATED_201);
	}
	
	@Given("Cat Facts API is Active")
	public boolean cat_Facts_API_Is_Active() {
		System.out.println("isCatFactsAPIActive : " + appProps.getPropertyValue("isCatFactsAPIActive"));
		return appProps.getPropertyValue("isCatFactsAPIActive").equalsIgnoreCase("true");
	}
}
