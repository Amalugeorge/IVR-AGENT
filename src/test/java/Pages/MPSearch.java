package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MPSearch {
WebDriver driver;
By search = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/ul/li[3]/a");
By srchmrgid = By.xpath("//input[@id='search-input']");
By searchbtn = By.xpath("//button[normalize-space()='Search']");
By mrkplce = By.xpath("//a[@class='btn btn-outline-primary btn-lg mb-2']");
public MPSearch(WebDriver driver)
{
	this.driver=driver;
}
public void mrp()
{
	driver.findElement(mrkplce).click();
}

public void srch(String mrg)
{
	driver.findElement(search).click();
	driver.findElement(srchmrgid).sendKeys(mrg);
	driver.findElement(searchbtn).click();
}
}
