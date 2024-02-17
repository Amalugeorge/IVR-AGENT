package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logintocrm {
WebDriver driver;
By lgntocrm = 	By.xpath("//a[normalize-space()='Login to CRM']");

public Logintocrm(WebDriver driver)
{
	this.driver=driver;
}
public void lgncrm()
{
	driver.findElement(lgntocrm).click();
}
}
