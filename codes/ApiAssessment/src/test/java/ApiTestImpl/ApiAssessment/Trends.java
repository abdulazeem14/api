package ApiTestImpl.ApiAssessment;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Trends extends Base {
	@Test(dataProvider="locations")
	public void trending_HashTag(String loc,String geocode) throws IOException {
		
		precondition();
		RestAssured.baseURI="https://api.twitter.com/1.1/trends/";
		Response res=given().auth().oauth(ConsumerKey,ConsumerSecretKey,AccessToken,AccessTokenSecret).queryParam("id",geocode).when().get("place.json").then().extract().response();
		String response=res.asString();
		JsonPath jp=new JsonPath(response);
		ArrayList<String> arr=new ArrayList<>();
		String s=null;
		arr.addAll((Collection<? extends String>) jp.get("trends.name"));
		Iterator itr=arr.iterator();
		while(itr.hasNext())
		{
		s=itr.next().toString();
		}
		s=s.substring(1,s.length()-1);
		String result[]=s.split(",");
		log1.info("Trending in "+loc);
		for(int i=0;i<5;i++)
		{
			log1.info(result[i]);
		}
		
		
	}
	@DataProvider
	public Object[][] locations(){
		Object loc[][]=new Object[4][2];
		loc[0][0]="india";
		loc[0][1] ="23424848";
		loc[1][0]="US";
		loc[1][1]="23424977";
		loc[2][0]="UK";
		loc[2][1]="23424975";
		loc[3][0]="Israel";
		loc[3][1]="23424852";
		return loc;
	}
	

}
