package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MPhomepge {
WebDriver driver;
By homepge = By.xpath("//div[@class='select__input-container css-19bb58m'][1]");
By alert = By.xpath("//button[normalize-space()='OK']");
By state = By.xpath("//div[@class='select__input-container css-19bb58m'][1]");
public MPhomepge(WebDriver driver)
{
	this.driver=driver;
}
public void hmepg()
{
	driver.findElement(homepge).click();
	driver.findElement(alert).click();
	driver.findElement(state).click();
}
}
