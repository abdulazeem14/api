package ApiTestImpl.ApiAssessment;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class DisplayUsername_tweet extends Base{
	
	@Test
	public void displayusername_tweet() throws IOException {
		precondition();
		RestAssured.baseURI="https://api.twitter.com/1.1/search/";
		Response res=given().auth().oauth(ConsumerKey,ConsumerSecretKey,AccessToken,AccessTokenSecret).
				queryParam("q", "#Qualitest").when().
				get("tweets.json").then().extract().response();
		String response=res.asString();
		JsonPath jp=new JsonPath(response);

		
		ArrayList<Object> arr=new ArrayList<>();
		ArrayList<Object> arr1=new ArrayList<>();
		arr.addAll(jp.getList("statuses.text"));
		arr1.addAll(jp.getList("statuses.user.name"));
	
		Iterator itr=arr.iterator();
		Iterator itr1=arr1.iterator();
		
		while(itr.hasNext())
		{		
			log1.info("Tweet:"+itr.next()+" UserName"+itr1.next());
		}
	
		
		
	}
	

}
