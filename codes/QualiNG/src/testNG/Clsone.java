package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Clsone {
				
	
			
	
			@AfterTest
			@Test
			public void MobileCreditcard1() {
				System.out.println("this is credit card web testcase 1");
			}
			
			@Parameters({"URL"})
			@Test
			public void ATest(String urlname)
			{
				System.out.println("this from parameter");
				System.out.println(urlname);
			}
			
			@Test
			public void MobileCreditcard2() {
				System.out.println("this is credit card web testcase 2");
			}
			
}
