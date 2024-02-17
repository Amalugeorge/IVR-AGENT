package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CallList {
WebDriver driver;
By calllst = By.xpath("//a[@href='/call-list']");

public CallList(WebDriver driver)
{
	this.driver=driver;
}
public void calllist()
{
	driver.findElement(calllst).click();
}
}
