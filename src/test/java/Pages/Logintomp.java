package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logintomp {
WebDriver driver;
By logintomrkplc = By.xpath("//a[normalize-space()='Login to Marketplace']");
public Logintomp(WebDriver driver)
{
	this.driver=driver;
}
public void lgnmp()
{
	driver.findElement(logintomrkplc).click();
}
}
