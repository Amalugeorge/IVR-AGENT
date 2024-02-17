package Pages;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class ViewLeadsAgentPage {
	WebDriver driver;
	By arialeads = By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div[3]/div/div/div/button");
	//By viewleads = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/ul/li[1]/a/span");
	By goldLeads = By.xpath("//a[normalize-space()='Gold']");
	By silverLeads = By.xpath("//a[normalize-space()='Silver']");
	By bookofbusinessLeads = By.xpath("//a[normalize-space()='Book of Business']");
	By downloadAllLeadInformationButton = By.xpath("//div[@class='d-flex align-items-center justify-content-end mb-1']//button[@type='button']");
	By downloadButton = By.xpath("//span[normalize-space()='Download']");
	By downloadAllButton = By.xpath("//a[normalize-space()='Download All']");
	By downloadSelectedLeadButton = By.xpath("//a[normalize-space()='Download Selected Leads']");
	By printSelectedLeadButton = By.xpath("//span[normalize-space()='Print Selected Leads']");
	By filterByType = By.xpath("//div[@class='react-select dataTable-filter-select css-2b097c-container'][1]");
	By search = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[3]/div/div[1]");
	By typeNEWMTG = By.xpath("//div[@class='select__menu css-26l3qy-menu']/div/div[1]");
	By typeRETROMTG = By.xpath("//div[@class='select__menu css-26l3qy-menu']/div/div[2]");
	By typeFEX = By.xpath("//div[@class='select__menu css-26l3qy-menu']/div/div[3]");
	By tableRow = By.xpath("//div[@class='sc-AxiKw jeFspv rdt_TableHeadRow']/div");
	By tableColumn = By.xpath("//div[@class='sc-fzpjYC jDDtMW rdt_TableBody']/div");
	By selectAllRows = By.xpath(
			"//div[@class='sc-AxhCb sc-fznKkj khGtBZ rdt_TableCol']//div[@class='custom-control custom-checkbox']");
	By listSearchElements = By.xpath("//div[@class='select__menu css-26l3qy-menu']/div/div");
	By searchInput = By.xpath("//*[@id=\"search-input\"]");
	By searchButton = By.xpath("//button[normalize-space()='Search']");
	By selectBox = By.xpath("//div[@id='row-1']//div[@class='custom-control custom-checkbox']");
	By setStatus = By.xpath("//div[@class='react-select setStatus css-2b097c-container']");
	By soldStatus = By.xpath("//div[@class='select__menu css-26l3qy-menu']/div/div[9]");
	By updateStatusButton = By.xpath("//button[normalize-space()='Update']");
	By browseupload = By.xpath("//div[@class='uppy-DragDrop-inner']");
	By uploadSubmitButton = By.xpath("//button[normalize-space()='Submit']");
	By addNotes=By.xpath("//div[@id='row-0']/div[3]/span[1]");
	By noteContent=By.xpath("//textarea[@id='add_note']");
	By submitNotes=By.xpath("//button[normalize-space()='Submit']");
	By alert = By.xpath("//button[normalize-space()='OK']");
	By silvercheckbx = By.xpath("//div[@id='row-0']//label[@class='custom-control-label']");
	By searchlistselect = By.xpath("//div[@class='select__menu-list css-11unzgr']/div[1]");
	By checkbox = By.xpath("//*[@id=\"row-3\"]/div[1]/div");
	By actions = By.xpath("//*[@id=\"more-actions\"]/div/div[1]");
	By copy = By.xpath("//div[@class='select__menu-list css-11unzgr']/div[1]");
	By selectagntdrp = By.xpath("//div[@class='react-select css-2b097c-container']/div/div[1]");
	By slctagnt = By.xpath("//div[@class='select__menu-list css-11unzgr']/div[100]");
	By submitagentcpy = By.xpath("//div[@class='text-center mt-2 pt-50 col-12']/button[1]");
	By close = By.xpath("//div[@class='select__indicators css-1wy0on6'][1]/div[1]");
	By chckbxsilver = By.xpath("//*[@id=\"row-1\"]/div[1]/div");
	By selectfile = By.xpath("//span[@class='uppy-DragDrop-browse']");
	By submit = By.xpath("//button[@class='me-1 btn btn-primary']");
	By applyfiltersgld = By.xpath("//button[@class='ml-1 filter-button btn btn-outline-primary']");
	By cancelgld = By.xpath("//button[@class='btn btn-outline-secondary']");
	By status = By.xpath("//span[@class='d-flex']//div[@class='select__value-container css-1hwfws3']");
	By statustype = By.xpath("//div[@class='select__menu css-26l3qy-menu']/div/div[1]");
	By submitfiltr = By.xpath("//button[normalize-space()='Submit']");
	By resetfltr = By.xpath("//button[normalize-space()='Reset Filters']");
	By editfltr = By.xpath("//button[@class='ml-1 filter-button btn btn-outline-danger']");
	By campaign = By.xpath("//input[@class='form-control'][1]");
	By mrgtid = By.xpath("//input[@inputmode='numeric']");
	By state = By.xpath("//div[@role='dialog']//div[4]//div[1]//input[1]");
	By county = By.xpath("//div//div[5]//div[1]//input[1]");
	By name = By.xpath("//input[@id='summary1']");
	By downloadbtn = By.xpath("//div[@class='ml-1 btn-group']");
	By downloadall = By.xpath("//a[normalize-space()='Download All']");
	By cancelcpy = By.xpath("//button[normalize-space()='Cancel']");
	By movegld = By.xpath("//div[@class='select__menu css-26l3qy-menu']/div/div[2]");
	By shw = By.xpath("//select[@id='sort-select']");
	By mrgid = By.xpath("//a[normalize-space()='#951']");
	By addeditnote = By.xpath("//button[@type='button']");
	By printselctd = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div[1]/div[1]/div[3]/div[2]/button");
	By silver = By.xpath("//a[normalize-space()='Silver']");
	By prntslctdslvr = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[2]/button");
	By slctedstatsslvr = By.xpath("//div[@class='select__menu css-26l3qy-menu']/div/div[4]");
	By bookofbusiness = By.xpath("//a[normalize-space()='Book of Business']");
	By prntslctedbob = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div[2]/div/div/div/div[4]/div[1]/div[3]/div[2]/button");
	By campaignbob = By.xpath("//div[@class='modal-content']//div[1]//div[1]//input[1]");
	By mrgbob = By.xpath("//input[@inputmode='numeric']");
	By statebob = By.xpath("//div[@class='modal-content']//div[3]//div[1]/input");
	By countybob = By.xpath("//div[@class='modal-content']//div[4]//div[1]/input");
	By namebob=  By.xpath("//div[@class='modal-content']//div[5]//div[1]/input");
	By addntebob = By.xpath("//*[@id=\"cell-25U3yvYE8-undefined\"]/span[1]");
	By viewuplddoc = By.xpath("//div[@id='row-1']//span[@title='Click Here to List Uploaded Documents']//*[name()='svg']");
	By cancel = By.xpath("//button[@class='btn btn-outline-secondary']");
	By note = By.xpath("//div[@class='sc-AxhCb sc-AxhUy sc-AxgMl kSZwH rdt_TableCell'][1]/span[1]");
	By txtnte = By.xpath("//textarea[@id='add_note']");
	By submitnte = By.xpath("//button[normalize-space()='Submit']");
	By upldeddoc = By.xpath("//a[normalize-space()='382_1691133292_images.jpg']");
	By dwnldallleads = By.xpath("//div[@class='d-flex align-items-center justify-content-end mb-1']//button[@type='button']");
	public ViewLeadsAgentPage(WebDriver driver) {
		this.driver = driver;
	}
	public void aria()
	{
		driver.findElement(arialeads).click();
		driver.findElement(alert).click();
	}
	public void agentLeadView() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(alert).click();
		driver.findElement(goldLeads).click();
		System.out.println("Gold button is working");
		driver.findElement(filterByType).click();
		System.out.println("filterbytype button is working");
		driver.findElement(typeRETROMTG).click();
		System.out.println("typeRETROMTG button is working");
		driver.findElement(close).click();
		//String input = "RETRO MTG";
		/*List<WebElement> rowCount = driver.findElements(tableRow);
		rowCount.size();
		List<WebElement> columnCount = driver.findElements(tableColumn);
		columnCount.size();

		for (int i = 0; i < columnCount.size(); i++) {
			WebElement name = columnCount.get(i);
			String Output = name.getText();
			System.out.println(Output);
			if (Output.contains(input)) {
				System.out.println("Dynamic table contains the data " + input);
			}
		}*/
		Thread.sleep(2000);
		driver.findElement(checkbox).click();
		driver.findElement(actions).click();
		driver.findElement(copy).click();
		driver.findElement(selectagntdrp).click();
		//driver.findElement(selectagntdrp).sendKeys("arun",Keys.ENTER);
		driver.findElement(slctagnt).click();
		driver.findElement(submitagentcpy).click();
		driver.findElement(cancelcpy).click();
	
	}
	public void move()
	{
		driver.findElement(checkbox).click();
		driver.findElement(actions).click();
		driver.findElement(movegld).click();
		driver.findElement(selectagntdrp).click();
		//driver.findElement(selectagntdrp).sendKeys("arun",Keys.ENTER);
		driver.findElement(slctagnt).click();
		driver.findElement(submitagentcpy).click();
		driver.findElement(cancelcpy).click();
	}
	public void printslct()
	{
		driver.findElement(checkbox).click();
		driver.findElement(printselctd).click();
	}
	public void dwnload()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.findElement(selectAllRows).click();
		
	//	System.out.println("selectallrows button is working");
		driver.findElement(checkbox).click();
		WebElement dwnldbtn=driver.findElement(downloadButton);
		dwnldbtn.click();
		System.out.println("downloadbutton button is working");
		driver.findElement(downloadSelectedLeadButton).click();
		System.out.println("downloadselectedlead button is working");
		dwnldbtn.click();
		driver.findElement(downloadAllButton).click();
		driver.findElement(chckbxsilver).click();
		//driver.findElement(printSelectedLeadButton).click();
			}

	/*public void searchFilter() throws InterruptedException {
		
		driver.findElement(silverLeads).click();
		System.out.println("silver button is working");
		//driver.findElement(silvercheckbx).click();
		driver.findElement(search).click();
		driver.findElement(searchlistselect).click();
		/*WebElement count = driver.findElements(listSearchElements).get(0);
		count.click();*/
		/*driver.findElement(searchInput).sendKeys("LUTFEY Garcia");
		System.out.println("search the given name");
		driver.findElement(searchButton).click();
		driver.findElement(chckbxsilver).click();*/

		//driver.findElement(downloadButton).click();
		

	//}

	public void requestSuppression() throws IOException, AWTException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(filterByType).click();
		driver.findElement(typeNEWMTG).click();
		Thread.sleep(2000);
		driver.findElement(checkbox).click();
		//Thread.sleep(2000);
		driver.findElement(setStatus).click();
		Thread.sleep(2000);
		
		WebElement sldstatus = driver.findElement(soldStatus);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(sldstatus);
		actions.perform();
		sldstatus.click();
		//driver.findElement(soldStatus).click();
		Thread.sleep(2000);

		driver.findElement(updateStatusButton).click();
	}
	public void browser() throws AWTException
	{
		// driver.findElement(browseupload).click();
		
		/*WebElement selectFile = driver.findElement(By.xpath("//div[@class='uppy-DragDrop-inner']"));
		selectFile.click();
		Thread.sleep(500);
		Runtime.getRuntime().exec("‪C:\\Users\\annuk\\Downloads\\Flowcharts.png");
		Thread.sleep(500);*/
		driver.findElement(selectfile).click();
		fileupload("C:\\Users\\annuk\\Downloads\\382_1691646278_download (3).png");
	}
private void fileupload(String p) throws AWTException {
	StringSelection strSelection = new StringSelection(p);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
	Robot robot = new Robot();
	robot.delay(3000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.delay(2000);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
}
public void submitupload()
{
	driver.findElement(submit).click();
}

	public void addNotes() throws InterruptedException {
		driver.findElement(filterByType).click();
		driver.findElement(typeNEWMTG).click();
		driver.findElement(selectBox).click();
		driver.findElement(addNotes).click();
		driver.findElement(noteContent).sendKeys("text added by automation");
		Thread.sleep(2000);

		driver.findElement(submitNotes).click();
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
		driver.findElement(downloadbtn).click();
		driver.findElement(downloadall).click();
	
	}
	public void agentsilver() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(alert).click();
		driver.findElement(silver).click();
		System.out.println("silver button is working");
		driver.findElement(filterByType).click();
		System.out.println("filterbytype button is working");
		driver.findElement(typeRETROMTG).click();
		System.out.println("typeRETROMTG button is working");
		driver.findElement(close).click();
		Thread.sleep(2000);
		driver.findElement(checkbox).click();
		driver.findElement(actions).click();
		driver.findElement(copy).click();
		driver.findElement(selectagntdrp).click();
		//driver.findElement(selectagntdrp).sendKeys("arun",Keys.ENTER);
		driver.findElement(slctagnt).click();
		driver.findElement(submitagentcpy).click();
		driver.findElement(cancelcpy).click();	
	}
	public void movesilver()
	{
		driver.findElement(silver).click();
		move();
		
	}
	public void printslctedsilver()
	{
		driver.findElement(silver).click();
		driver.findElement(checkbox).click();
		driver.findElement(prntslctdslvr).click();
	}
	public void dwnldslvr()
	{
		driver.findElement(silver).click();
		dwnload();
	}
	public void setstatussilver() throws IOException, AWTException, InterruptedException
	{
		driver.findElement(silver).click();
		driver.findElement(checkbox).click();
		//Thread.sleep(2000);
		driver.findElement(setStatus).click();
		Thread.sleep(2000);
		
		WebElement sldstatus = driver.findElement(soldStatus);
		driver.findElement(slctedstatsslvr).click();
		Thread.sleep(2000);

		driver.findElement(updateStatusButton).click();
	}
	public void addntslvr() throws InterruptedException
	{
		driver.findElement(silver).click();
		addNotes();
	}
	public void shwnosilver()
	{	
		driver.findElement(silver).click();
		shwnm();
	}
	public void applyfltrslvr(String cmp,String id,String ste,String cnty,String nme)
	{
		driver.findElement(silver).click();
		applyfiltrsts();
		applyfltercmp(cmp);
		applyfiltrmrg(id);
		applyfiltstate(ste);
		applyfiltrcnty(cnty);
		applyfltrnme(nme);
	}
	public void dwnldfiltrsilver(String cmp,String id,String ste,String cnty,String nme)
	{
		driver.findElement(silver).click();
		downloadapplyfltr(cmp, id, ste, cnty, nme);
	}
	public void bookofbusiness()
	{
		driver.findElement(bookofbusiness).click();
	}
	public void printslctedbob()
	{
		driver.findElement(bookofbusiness).click();
		driver.findElement(checkbox).click();
		driver.findElement(prntslctedbob).click();
	}
	public void dwnldbob()
	{
		driver.findElement(bookofbusiness).click();
		dwnload();
		driver.findElement(dwnldallleads).click();
	}
	
	public void applyfltrbob(String cmp,String id,String ste,String cnty,String nme)
	{
		driver.findElement(bookofbusiness).click();
		applyfltercmp(cmp);
		applyfiltrmrg(id);
		applyfiltstate(ste);
		applyfiltrcnty(cnty);
		applyfltrnme(nme);
	}
	public void downloadapplyfltrbob(String cmp,String id,String ste,String cnty,String nme)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(bookofbusiness).click();
		driver.findElement(applyfiltersgld).click();
		driver.findElement(campaignbob).sendKeys(cmp);
		driver.findElement(mrgbob).sendKeys(id);
		driver.findElement(statebob).sendKeys(ste);
		driver.findElement(countybob).sendKeys(cnty);
		driver.findElement(namebob).sendKeys(nme);
		driver.findElement(submitfiltr).click();
		driver.findElement(downloadbtn).click();
		driver.findElement(downloadall).click();
		
	
	}
	public void addntbob() throws InterruptedException
	{
		driver.findElement(bookofbusiness).click();
		Thread.sleep(2000);
		driver.findElement(addntebob).click();
		driver.findElement(noteContent).sendKeys("text added by automation");
		Thread.sleep(2000);

		driver.findElement(submitNotes).click();
	}
	public void shwnobob()
	{	
		driver.findElement(bookofbusiness).click();
		shwnm();
	}
	public void viewuploaddoc() throws InterruptedException
	{
		driver.findElement(bookofbusiness).click();
		Thread.sleep(2000);
		driver.findElement(viewuplddoc).click();
		driver.findElement(upldeddoc).click();
		driver.findElement(cancel).click();
	}
	public void nte(String notetxt)
	{
		driver.findElement(bookofbusiness).click();
		driver.findElement(note).click();
		driver.findElement(txtnte).sendKeys(notetxt);
		driver.findElement(submitnte).click();
		System.out.println("note submitted");
		//driver.findElement(mrtgidopn).click();
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");	
		driver.findElement(addeditnote).click();*/
	}
}
