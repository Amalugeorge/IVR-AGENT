package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FAQ {
WebDriver driver;
By faq = By.xpath("//a[@href='/faq']");
By nxtfaq = By.xpath("//a[normalize-space()='dfsdfs1212']");

public FAQ(WebDriver driver)
{
	this.driver = driver;
}
public void faqpg()
{
	driver.findElement(faq).click();
	driver.findElement(nxtfaq).click();
	
}
}
