package testNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Clsthree {
	@Test
	public void MobileDebitcard1() {
		System.out.println("Mobile Debit card 1");
	}
	@Test
	public void MobileDebitcard2() {
		System.out.println("Mobile Debit card 2");
	}
	@BeforeClass
	public void bclass() {
		System.out.println("this is before the class execution");
	}

}
