package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Communicationsavedaddrpay {
	WebDriver driver;
	By sameaddr = By.xpath("//input[@id='address333']");
	By editaddr = By.xpath("//div[@class='d-flex justify-content-between align-items-center']//*[name()='svg']");
	By confmaddr = By.xpath("//button[@type='submit']");
	By savedpaym = By.xpath("//*[@id=\"521284514\"]");
	By cvv = By.xpath("//*[@id=\"card_holder_cvv\"]");
	By placeorder =By.xpath("//button[normalize-space()='Place Order']");

	public Communicationsavedaddrpay(WebDriver driver) {
		this.driver=driver;
	}
	public void alreadyentraddr(String cardcod)
	{
		driver.findElement(sameaddr).click();
		driver.findElement(editaddr).click();
		driver.findElement(confmaddr).click();
		driver.findElement(savedpaym).click();
		driver.findElement(cvv).sendKeys(cardcod);
		driver.findElement(placeorder).click();
		
	}
}
