package ApiTestImpl.ApiAssessment;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Tweets_By_User extends Base{
	@Test
	public void tweets_By_User() throws IOException {
		precondition();
		RestAssured.baseURI="https://api.twitter.com/2/users/"+id+"/tweets";
		Response res=given().auth().oauth(ConsumerKey,ConsumerSecretKey,AccessToken,AccessTokenSecret).when().get().then().extract().response();
		String response=res.asString();
		JsonPath jp=new JsonPath(response);
		ArrayList<Object> arr=new ArrayList<>();
		arr.addAll(jp.getList("data.text"));
		Iterator itr=arr.iterator();
		while(itr.hasNext())
		{
			log1.info(itr.next());
		}
		
		
	} 

}
