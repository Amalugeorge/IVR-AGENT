package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Purchaseddata {
	WebDriver driver;
	By purchasedleads = By.xpath("//a[@href='/purchased-data']");
	By checkbox = By.xpath("//div[@class='sc-AxhCb sc-AxheI hlQzeM rdt_TableCell'][1]");
	By actions = By.xpath("//div[@class='select__control css-1eyvi4t-control'][1]/div[1]");
	By copy = By.xpath("//div[@class='select__menu-list css-11unzgr']/div[1]");
	By selectagntdrp = By.xpath("//div[@class='react-select css-2b097c-container']/div/div[1]");
	By slctagnt = By.xpath("//div[@class='select__menu-list css-11unzgr']/div[100]");
	By submitagentcpy = By.xpath("//div[@class='text-center mt-2 pt-50 col-12']/button[1]");
	By move = By.xpath("//div[@class='select__menu-list css-11unzgr']/div[2]");
	By search = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div/div/div/div/div[1]/div[1]/div[2]/div[2]/div/div[1]");
	By slctsrch = By.xpath("//div[@class='select__menu-list css-11unzgr']/div[1]");
	By entrsrch = By.xpath("//*[@id=\"search-input\"]");
	By sbmtsrch = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div/div/div/div/div[1]/div[1]/div[2]/button");
	By setstatus = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div/div/div/div/div[1]/div[1]/div[3]/div[1]/div/div[1]");
	By selectstatus= By.xpath("//div[@class='select__menu-list css-11unzgr']/div[3]");
	By update = By.xpath("//button[normalize-space()='Update']");
	By printselected  = By.xpath("//button[@class='ml-1 btn btn-outline-primary btn-md']");
	By dwnldbutn  = By.xpath("//button[@class='btn btn-outline-primary']");
	By dwnldselectd = By.xpath("//a[normalize-space()='Download Selected Leads']");
	By dwnldall = By.xpath("//a[normalize-space()='Download All']");
	By silver = By.xpath("//a[normalize-space()='Silver']");
	By bookofbus = By.xpath("//a[normalize-space()='Book of Business']");

	public Purchaseddata(WebDriver driver) {
		this.driver=driver;
	}
	public void purchsed()
	{
		driver.findElement(purchasedleads).click();;
	}
	public void actions()  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(checkbox).click();
		driver.findElement(actions).click();
		driver.findElement(copy).click();
		driver.findElement(selectagntdrp).click();
		//driver.findElement(selectagntdrp).sendKeys("arun",Keys.ENTER);
		driver.findElement(slctagnt).click();
		driver.findElement(submitagentcpy).click();
	}
	public void move()  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(checkbox).click();
		driver.findElement(actions).click();
		driver.findElement(move).click();
		
		driver.findElement(selectagntdrp).click();
		driver.findElement(slctagnt).click();
		driver.findElement(submitagentcpy).click();
	}
	public void search()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(search).click();
		driver.findElement(slctsrch).click();
		driver.findElement(entrsrch).sendKeys("Kelly");
		driver.findElement(sbmtsrch).click();
	}
	public void status()

	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(checkbox).click();
		driver.findElement(setstatus).click();
		driver.findElement(selectstatus).click();
		driver.findElement(update).click();
	}
	public void printslcted()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(checkbox).click();
		driver.findElement(printselected).click();
	}
	public void dwnld()
	{
		driver.findElement(checkbox).click();
		WebElement dwn = driver.findElement(dwnldbutn);
		dwn.click();
		driver.findElement(dwnldselectd).click();
		dwn.click();
		driver.findElement(dwnldall).click();
	}
	public void buttn()
	{
		driver.findElement(silver).click();
		driver.findElement(bookofbus).click();
	}
}
