package ApiTestImpl.ApiAssessment;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import java.io.IOException;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class SendTweet extends Base {
	
	@Test
	public void sendtweet() throws IOException {
		precondition();
		RestAssured.baseURI="https://api.twitter.com/1.1/statuses/";
		Response res=given().
				auth().oauth(ConsumerKey,ConsumerSecretKey,AccessToken,AccessTokenSecret).
				queryParam("status","api testing06").
				when().
				post("update.json").
				then().extract().response();
		String response=res.asString();
		JsonPath jp=new JsonPath(response);
		String id=jp.get("id").toString();
		String createdat=jp.get("created_at");
		String tweet=jp.get("text");
		log1.fatal("Tweet send");
		log1.error("Created at:"+createdat+" Tweet:"+tweet+" Id:"+id);
	
		
		
		
		
		
		
	}
}
