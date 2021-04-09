package ApiTestImpl.ApiAssessment;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Block_user extends Base {
	@Test
	public void block_user() throws IOException {
		precondition();
		RestAssured.baseURI="https://api.twitter.com/1.1/blocks/";
		Response res=given().auth().oauth(ConsumerKey,ConsumerSecretKey,AccessToken,AccessTokenSecret).queryParam("id","3277533498").when().post("create.json").then().extract().response();
		String response=res.asString();
		JsonPath jp=new JsonPath(response);
	String name=jp.get("name");
	System.out.println(name);
	}
}
