package qualitestAPITest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
public class Apitest {
@Test
public void Qtest() {
RestAssured.baseURI="https://reqres.in/";

//get method

Response res=given().pathParam("page", 2).when().get("/api/users").then().assertThat().statusCode(200).and().contentType(ContentType.JSON).extract().response();

String responsestring=res.asString();
System.out.println("Get response"+responsestring);
//put method
JsonPath jp=new JsonPath(responsestring);
String fname=jp.get("data[0].first_name");
System.out.println("firstNAme:"+fname);
Response res1=given().body("{\r\n"
		+ "    \"name\": \""+fname+"\",\r\n"
		+ "    \"job\": \"zion resident\"\r\n"
		+ "}").when().put("/api/users/2").then().assertThat().statusCode(200).extract().response();
String resput=res1.asString();
System.out.println(resput);
 }
}