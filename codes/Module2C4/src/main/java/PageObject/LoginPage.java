package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver wd;

By loginExistingacnt=By.xpath("//input[@id='u_0_b_t7']");
By email=By.xpath("//*[@id=\"email\"]");
By password=By.xpath("//*[@id=\"pass\"]");
By Login=By.xpath("//*[@id=\"u_0_a_eP\"]");


public WebElement loginExistingacnt()
{
	return wd.findElement(loginExistingacnt);
}
public WebElement email() {
	return wd.findElement(email);
}
public WebElement password() {
	return wd.findElement(password);
}
public WebElement Login() {
	return wd.findElement(Login);
}

}
