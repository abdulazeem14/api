package ApiTestImpl.ApiAssessment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
public class Search_by_Tweets extends Base{
	@Test
	public void search_for_tweets() throws IOException {
		precondition();
		RestAssured.baseURI="https://api.twitter.com/1.1/search/";
		Response res=given().auth()
				.oauth(ConsumerKey,ConsumerSecretKey,AccessToken,AccessTokenSecret)
				.queryParam("geocode","20.5937%2C78.9629%2C4300mi","q","%23Qualitest")
				.when().get("tweets.json").then().extract().path("statuses");
		
		String response=res.getBody().asString();
		System.out.println(response);
		JsonPath jp=new JsonPath(response);
		ArrayList<String> arr=new ArrayList<>();
		arr.addAll((Collection<? extends String>) jp.get("statuses"));
		System.out.println(arr);		
		
		
	}
}
