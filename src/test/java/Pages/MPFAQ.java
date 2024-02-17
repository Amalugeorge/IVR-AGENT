package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MPFAQ {
	WebDriver driver;
	By faq = By.xpath("//a[@href='/faq']");
	By nxtfaq = By.xpath("//a[@href='/notification']");

	public MPFAQ(WebDriver driver)
	{
		this.driver = driver;
	}
	public void faqpg()
	{
		driver.findElement(faq).click();
		driver.findElement(nxtfaq).click();
		
	}
}
