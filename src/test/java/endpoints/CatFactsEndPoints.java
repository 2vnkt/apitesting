package endpoints;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.Constants;

public class CatFactsEndPoints extends BaseEndPoints {
	
	public Response getCatFacts() {
		RequestSpecification rSpec = getCommonSpec("https://cat-fact.herokuapp.com/facts/");
		return sendRequest(rSpec, Constants.RequestType.GET_REQUEST, null);
	}
	
	public boolean verifyCatFactsValuesAreAsExpected(Response response) {
		System.out.println("body : " + response.getBody().toString());
		return response.getBody() != null ;
	}
}
