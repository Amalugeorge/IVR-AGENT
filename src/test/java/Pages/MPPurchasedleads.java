package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MPPurchasedleads {
	WebDriver driver;
	By purchasedleads = By.xpath("//a[@href='/purchased-leads']");
	By checkbox = By.xpath("//div[@class='sc-fFGjHI sc-gxYJeL cedzYy kFkqPg rdt_TableCell']/input[1]");
	By actions = By.xpath("//div[@class='select__input-container css-19bb58m'][1]");
	By copy = By.xpath("//div[@class='select__menu-list css-qr46ko']/div[1]");
	By selectagntdrp = By.xpath("//div[@class='react-select css-b62m3t-container']//div[@class='select__input-container css-19bb58m']");
	By slctagnt = By.xpath("//div[@class='select__menu-list css-qr46ko']/div[3]");
	By submitagentcpy = By.xpath("//div[@class='text-center mt-2 pt-50 col-12']/button[1]");
	By move = By.xpath("//div[@class='select__menu-list css-qr46ko']/div[2]");
	By search = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div/div/div/div/div[1]/div[1]/div[2]/div[2]/div/div[1]");
	By slctsrch = By.xpath("//div[@class='select__menu-list css-qr46ko']/div[1]");
	By entrsrch = By.xpath("//*[@id=\"search-input\"]");
	By sbmtsrch = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div/div/div/div/div[1]/div[1]/div[2]/button");
	By setstatus = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div/div/div/div/div[1]/div[1]/div[3]/div[1]/div/span/div/div/div[1]");
	By selectstatus= By.xpath("//div[@class='select__menu css-1nmdiq5-menu']/div/div[3]");
	By update = By.xpath("//button[normalize-space()='Update']");
	By printselected  = By.xpath("//button[@class='me-1 btn btn-outline-primary']");
	By dwnldbutn  = By.xpath("//button[@class='btn btn-outline-primary']");
	By dwnldselectd = By.xpath("//a[normalize-space()='Download Selected Leads']");
	By dwnldall = By.xpath("//a[normalize-space()='Download All']");
	By silver = By.xpath("//a[normalize-space()='Silver']");
	By bookofbus = By.xpath("//a[normalize-space()='Book of Business']");

	By applyfiltersgld = By.xpath("//button[@class='ml-1 filter-button btn btn-outline-primary']");
	By cancelgld = By.xpath("//button[@class='btn btn-outline-secondary']");
	By status = By.xpath("//div[@class='react-select setStatus css-b62m3t-container']//div[@class='select__value-container css-hlgwow']");
	By statustype = By.xpath("//div[@class='select__menu-list css-qr46ko']/div[3]");
	By submitfiltr = By.xpath("//button[normalize-space()='Submit']");
	By resetfltr = By.xpath("//button[normalize-space()='Reset Filters']");
	By editfltr = By.xpath("//button[@class='ml-1 filter-button btn btn-outline-danger']");
	By campaign = By.xpath("//input[@class='form-control'][1]");
	By mrgtid = By.xpath("//input[@inputmode='numeric']");
	By state = By.xpath("//div[@role='dialog']//div[4]//div[1]//input[1]");
	By county = By.xpath("//div//div[5]//div[1]//input[1]");
	By name = By.xpath("//input[@id='summary1']");
	By setstatusilver = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/span/div/div/div[1]");
	
	By addNotes=By.xpath("//div[@id='row-0']/div[3]/span[1]");
	By noteContent=By.xpath("//textarea[@id='add_note']");
	By submitNotes=By.xpath("//button[normalize-space()='Submit']");
	By shw = By.xpath("//select[@id='sort-select']");
	By cmgbob = By.xpath("//body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]");
	By campaignbob = By.xpath("//div[@class='modal-content']//div[1]//div[1]//input[1]");
	By mrgbob = By.xpath("//input[@inputmode='numeric']");
	By statebob = By.xpath("//div[@class='modal-content']//div[3]//div[1]/input");
	By countybob = By.xpath("//div[@class='modal-content']//div[4]//div[1]/input");
	By namebob=  By.xpath("//div[@class='modal-content']//div[5]//div[1]/input");

	public MPPurchasedleads(WebDriver driver) {
		this.driver=driver;
	}
	public void purchsed()
	{
		driver.findElement(purchasedleads).click();
	}
	public void actions() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(checkbox).click();
		driver.findElement(actions).click();
		driver.findElement(copy).click();
		driver.findElement(selectagntdrp).click();
		driver.findElement(slctagnt).click();
		driver.findElement(submitagentcpy).click();
	}
	public void move() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(checkbox).click();
		driver.findElement(actions).click();
		driver.findElement(move).click();
		driver.findElement(selectagntdrp).click();
		driver.findElement(slctagnt).click();
		driver.findElement(submitagentcpy).click();
	}
	
	public void status()

	{
		driver.findElement(checkbox).click();
		driver.findElement(setstatus).click();
		driver.findElement(selectstatus).click();
		driver.findElement(update).click();
	}
	public void printslcted()
	{
		driver.findElement(checkbox).click();
		driver.findElement(printselected).click();
	}
	public void dwnld()
	{
		driver.findElement(checkbox).click();
		WebElement dwn = driver.findElement(dwnldbutn);
		dwn.click();
		driver.findElement(dwnldselectd).click();
		System.out.println("download selected");
		dwn.click();
		driver.findElement(dwnldall).click();
		System.out.println("Download all");
	}
	public void addNotes() throws InterruptedException {
		driver.findElement(addNotes).click();
		driver.findElement(noteContent).sendKeys("text added by automation");
		Thread.sleep(2000);

		driver.findElement(submitNotes).click();
		System.out.println("Note added successfully");
		//driver.findElement(mrgid).click();
		
	}
	public void shwnm()
	{
	driver.findElement(shw).click();
	Select drp = new Select(driver.findElement(shw));
	drp.selectByVisibleText("10");

	}

	public void applyfiltrsts()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(applyfiltersgld).click();
		driver.findElement(status).click();
		driver.findElement(statustype).click();
		driver.findElement(submitfiltr).click();
		System.out.println("filtered status");
		driver.findElement(editfltr).click();
		driver.findElement(resetfltr).click();
		System.out.println("reset filter--status");
	}
	public void applyfltercmp(String cmp)
	{
		driver.findElement(applyfiltersgld).click();
		driver.findElement(campaign).sendKeys(cmp);
		driver.findElement(submitfiltr).click();
		System.out.println("filtered cmpid");
		driver.findElement(resetfltr).click();
		System.out.println("reset filter--cmp");
	}
	public void applyfiltrmrg(String id) {
		
		driver.findElement(applyfiltersgld).click();
		driver.findElement(mrgtid).sendKeys(id);
		driver.findElement(submitfiltr).click();
		System.out.println("filtered mrgid");
		driver.findElement(resetfltr).click();
		System.out.println("reset filter--mrgid");
	}
	public void applyfiltstate(String ste) {
		driver.findElement(applyfiltersgld).click();
		driver.findElement(state).sendKeys(ste);
		driver.findElement(submitfiltr).click();
		System.out.println("filtered state");
		driver.findElement(resetfltr).click();
		System.out.println("reset filter--state");
	}
	public void applyfiltrcnty(String cnty)
	{
		driver.findElement(applyfiltersgld).click();
		driver.findElement(county).sendKeys(cnty);
		driver.findElement(submitfiltr).click();
		System.out.println("filtered county");
		driver.findElement(resetfltr).click();
		System.out.println("reset filter--county");
	}
	public void applyfltrnme(String nme) {
		driver.findElement(applyfiltersgld).click();
		driver.findElement(name).sendKeys(nme);
		driver.findElement(submitfiltr).click();
		System.out.println("filtered name");
		driver.findElement(resetfltr).click();
		System.out.println("reset filter--name");
	}
	public void downloadapplyfltr(String cmp,String id,String ste,String cnty,String nme)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(applyfiltersgld).click();
		driver.findElement(status).click();
		driver.findElement(statustype).click();
		driver.findElement(campaign).sendKeys(cmp);
		driver.findElement(mrgtid).sendKeys(id);
		driver.findElement(state).sendKeys(ste);
		driver.findElement(county).sendKeys(cnty);
		driver.findElement(name).sendKeys(nme);
		driver.findElement(submitfiltr).click();
		driver.findElement(dwnldbutn).click();
		driver.findElement(dwnldall).click();
	
	}
	public void silver() throws InterruptedException
	{
		driver.findElement(silver).click();
		actions();
	}
	public void movesilver()
	{
		driver.findElement(silver).click();
		move();
	}
	public void statussilver()

	{
		driver.findElement(silver).click();
		driver.findElement(checkbox).click();
		driver.findElement(setstatusilver).click();
		driver.findElement(selectstatus).click();
		driver.findElement(update).click();
	}
	public void printsilver()
	{
		driver.findElement(silver).click();
		printslcted();
	}
	public void dwnldsilver()
	{
		driver.findElement(silver).click();
		dwnld();
	}
	public void addntesilver() throws InterruptedException
	{
		driver.findElement(silver).click();
		addNotes();
	}
	public void shwnmsilver()
	{
		driver.findElement(silver).click();
		shwnm();
	}
	public void applyfiltersilver()
	{
		driver.findElement(silver).click();
		applyfiltrsts();
	}
	public void applyfltercmpsilver(String cmp)
	{
		driver.findElement(silver).click();
		applyfltercmp(cmp);
	}
	public void applyfiltrmrgsilver(String id) {
		driver.findElement(silver).click();
		applyfiltrmrg(id);
	}
	public void applyfiltstatesilver(String ste) {
		driver.findElement(silver).click();
		applyfiltstate(ste);
	}
	public void applyfiltrcntysilver(String cnty)
	{
		driver.findElement(silver).click();
		applyfiltrcnty(cnty);
	}
	public void applyfltrnmesilver(String nme) {
		driver.findElement(silver).click();
		applyfltrnme(nme);
	}
	public void downloadapplyfltrsilver(String cmp,String id,String ste,String cnty,String nme)
	{
		driver.findElement(silver).click();
		downloadapplyfltr(cmp,id,ste,cnty,nme);
	}
	public void bob()
	{
		driver.findElement(bookofbus).click();
		printslcted();
		System.out.println("print selected");
		dwnld();
	
	}
	public void addntebob() throws InterruptedException
	{
		driver.findElement(bookofbus).click();
		addNotes();
	}
	public void shwnbob()
	{
		driver.findElement(bookofbus).click();
		shwnm();
	}
	/*public void applyfilterbob()
	{
		driver.findElement(bookofbus).click();
		applyfltercmp(cmp);
		applyfiltrmrg(id);
		applyfiltstate(ste);
		applyfiltrcnty(cnty);
		applyfltrnme(nme);
	}*/
	public void applyfltrcmgbob(String cmp)
	{
		driver.findElement(bookofbus).click();
		driver.findElement(applyfiltersgld).click();
		driver.findElement(campaignbob).sendKeys(cmp);
		driver.findElement(submitfiltr).click();
		System.out.println("filtered cmpid");
		driver.findElement(editfltr).click();
		driver.findElement(resetfltr).click();
		System.out.println("reset filter--cmp");
		
	}
	public void applyfiltermrgbob(String id) {
		driver.findElement(bookofbus).click();
		driver.findElement(applyfiltersgld).click();
		driver.findElement(mrgbob).sendKeys(id);
		driver.findElement(submitfiltr).click();
		System.out.println("filtered mrgid");
		driver.findElement(editfltr).click();
		driver.findElement(resetfltr).click();
		System.out.println("reset filter--mrgid");
	}
	public void applyfilterstebob(String ste) throws InterruptedException {
		driver.findElement(bookofbus).click();
		driver.findElement(applyfiltersgld).click();
		driver.findElement(statebob).sendKeys(ste);
		driver.findElement(submitfiltr).click();
		System.out.println("filtered state");
		driver.findElement(editfltr).click();
		driver.findElement(resetfltr).click();
		System.out.println("reset filter--state");
	}
	public void applyfiltercntybob(String cnty)
	{
		driver.findElement(bookofbus).click();
		applyfiltrcnty(cnty);
		driver.findElement(submitfiltr).click();
		System.out.println("filtered county");
		driver.findElement(resetfltr).click();
		System.out.println("reset filter--county");
	
	}
	public void applyfilternmebob(String nme)
	{
		driver.findElement(bookofbus).click();
		applyfltrnme(nme);
		driver.findElement(submitfiltr).click();
		System.out.println("filtered name");
		driver.findElement(resetfltr).click();
		System.out.println("reset filter--name");

	}
	public void downloadapplyfilter(String cmp,String id,String ste,String cnty,String nme)
	{
		driver.findElement(bookofbus).click();
		driver.findElement(applyfiltersgld).click();
		driver.findElement(campaignbob).sendKeys(cmp);
		driver.findElement(mrgbob).sendKeys(id);
		driver.findElement(statebob).sendKeys(ste);
		driver.findElement(countybob).sendKeys(cnty);
		driver.findElement(namebob).sendKeys(nme);
		driver.findElement(submitfiltr).click();
		driver.findElement(dwnldbutn).click();
		driver.findElement(dwnldall).click();
	}
	}

