package qualitest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FooterLink {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Qualitest\\\\Desktop\\\\selinium_jar\\\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		//wd.get("https://www.facebook.com/campaign/landing.php?&campaign_id=973072061&extra_1=s|c|256741341326|e|facebook|&placement=&creative=256741341326&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D973072061%26adgroupid%3D54006406691%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-297690534863%26loc_physical_ms%3D9062037%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI0ZHGnZa07wIVizMrCh2WugrrEAAYASAAEgIH-vD_BwE");
		wd.get("https://www.qualitestgroup.com/");
		//WebElement footer=wd.findElement(By.xpath("//*[@id=\"pageFooter\"]"));
		//WebElement footer=wd.findElement(By.xpath("//div[@class='footer__main']"));
		//System.out.println(footer.findElements(By.tagName("a")).size());
		
//		List<WebElement> list= wd.findElements(By.xpath("//div[@class='menu-footer-solutions-container']/ul/li"));
//		
//		WebElement footer=wd.findElement(By.xpath("//div[@class='menu-footer-solutions-container']/ul/li"));
//		Actions actions = new Actions(wd);
//		actions.moveToElement(footer);
//		actions.perform();
//
//		for(int i=0;i<list.size();i++) {
//			String clickTab=Keys.chord(Keys.CONTROL, Keys.ENTER);
//			//Thread.sleep(10000);
//			list.get(i).sendKeys(clickTab);
//			Thread.sleep(10000L);
//		}
		
//		
		WebElement footer=wd.findElement(By.xpath("//*[@id=\"main_footer\"]/div[2]/div[1]/div"));
		int s=footer.findElements(By.tagName("a")).size();
		for(int i=0;i<s;i++)
		{
			String clk=Keys.chord(Keys.CONTROL,Keys.ENTER);
			footer.findElements(By.tagName("a")).get(i).sendKeys(clk);
			
		}
		List<String> ls=new ArrayList<>();
		ls.addAll(wd.getWindowHandles());
		for(int i=0;i<ls.size();i++)
		{
		System.out.println(wd.getTitle());
			wd.switchTo().window(ls.get(i));
		}
		
		
		
	}

}
