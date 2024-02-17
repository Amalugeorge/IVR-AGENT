package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {
	WebDriver driver;
	By search = By.xpath("//a[@href='/search']");
	By srchmrgid = By.xpath("//input[@id='search-input']");
	By searchbtn = By.xpath("//button[normalize-space()='Search']");
	public Search(WebDriver driver)
	{
		this.driver=driver;
	}
	public void srch(String n)
	{
		driver.findElement(search).click();
		driver.findElement(srchmrgid).sendKeys(n);
		driver.findElement(searchbtn).click();
	}
	}

