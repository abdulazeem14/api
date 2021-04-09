package test;
import static io.restassured.RestAssured.given;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TestScript {
	
	String ConsumerKey= null;
	String ConsumerSecretKey=null;
	String AccessToken=null;
	String AccessTokenSecret=null;
	
	
	@BeforeTest
	public void precondition() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Qualitest\\eclipse-workspace\\ApiTesting\\src\\resources\\data.properties");
		prop.load(fis);
		ConsumerKey=prop.getProperty("ConsumerKey");
		ConsumerSecretKey=prop.getProperty("ConsumerSecretKey");
		AccessToken=prop.getProperty("AccessToken");
		AccessTokenSecret=prop.getProperty("AccessTokenSecret"); 
	}
	
//	@Test
//	public void sendtweet() {
//		RestAssured.baseURI="https://api.twitter.com/1.1/statuses/";
//		Response res=given().
//				auth().oauth(ConsumerKey,ConsumerSecretKey,AccessToken,AccessTokenSecret).
//				queryParam("status","api testing2").
//				when().
//				post("update.json").
//				then().extract().response();
//		String response=res.asString();
//		System.out.println(response);
//		JsonPath jp=new JsonPath(response);
//		String id=jp.get("id").toString();
//		System.out.println(id);
//		String text=jp.get("text").toString();
//		System.out.println(text);
//		
//		
//	}
	@Test
	public void search_for_tweets() {
		RestAssured.baseURI="https://api.twitter.com/1.1/search/";
		Response res=given().auth()
				.oauth(ConsumerKey,ConsumerSecretKey,AccessToken,AccessTokenSecret).queryParam("geocode","20.5937%2C78.9629%2C4300mi","q","%23Qualitest").when().get("tweets.json").then().extract().response();
		String response=res.asString();
		System.out.println(response);
		
		
	}
	@Test(dataProvider="locations")
	public void trending_HashTag(String loc,String geocode) {
		
		RestAssured.baseURI="https://api.twitter.com/1.1/trends/";
		Response res=given().auth().oauth(ConsumerKey,ConsumerSecretKey,AccessToken,AccessTokenSecret).queryParam("id",geocode).when().get("place.json").then().extract().response();
		String response=res.asString();
		JsonPath jp=new JsonPath(response);
		ArrayList<String> arr=new ArrayList<>();
		String s=null;
		arr.addAll(jp.get("trends.name"));
		Iterator itr=arr.iterator();
		while(itr.hasNext())
		{
		s=itr.next().toString();
		}
	
		s=s.substring(1,s.length()-1);
		String result[]=s.split(",");
		System.out.println("-------------------"+loc+"-----------------------");
		for(int i=0;i<5;i++)
		{
			System.out.println(result[i]);
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
