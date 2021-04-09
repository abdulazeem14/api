package ApiTestImpl.ApiAssessment;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Weather_Update extends Base{
	@Test
	public void weather_update() throws IOException {
		precondition();
		RestAssured.baseURI="https://api.twitter.com/1.1/search/";
		Response res=given().auth().oauth(ConsumerKey,ConsumerSecretKey,AccessToken,AccessTokenSecret).
				queryParam("q", "#Bangalore #Weather").when().
				get("tweets.json").then().extract().response();
		String response=res.asString();
		JsonPath jp=new JsonPath(response);
		ArrayList<Object> arr=new ArrayList<>();
		arr.addAll(jp.getList("statuses.text"));
		Iterator itr=arr.iterator();
		while(itr.hasNext())
		{		
			log1.info(itr.next());
		}
		
		
	}
}
