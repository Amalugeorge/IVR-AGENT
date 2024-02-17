package Test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import Pages.ViewLeadsAgentPage;


public class ViewLeadsAgentTest extends Baseclass {
	
	@Test
	public void agentView() throws InterruptedException, IOException, AWTException {
		ViewLeadsAgentPage v = new ViewLeadsAgentPage(driver);
		v.aria();
		//v.agentLeadView();
		//v.move();
		//v.dwnload();
		//v.printslct();
		//v.requestSuppression();
		//v.browser();
		//v.submitupload();
		//v.addNotes();
		 //v.shwnm();
		//v.applyfiltrsts();
		//v.applyfltercmp("wk0");
		//v.applyfiltrmrg("29000042");
		//v.applyfiltstate("id");
		//v.applyfiltrcnty("Bonneville");
		//v.applyfltrnme("Btest");
		//v.downloadapplyfltr("duplicate", "2012", "IN", "Marion", "Ctest");
		//v.agentsilver();
		//v.movesilver();
		//v.printslctedsilver();
		//v.dwnldslvr();
		//v.setstatussilver();
		//v.addntslvr();
		//v.shwnosilver();
		//v.applyfltrslvr("wk1","26032567","tx","Montgomery","Danielle");
		//v.dwnldfiltrsilver("wk1","25061114","pa","Northampton","Miguel");
		//v.bookofbusiness();
		//v.printslctedbob();
		//v.dwnldbob();
		v.applyfltrbob("test","920","ia","ackley","ctest");
		//v.downloadapplyfltrbob("test","920","ia","ackley","ctest");
		//v.addntbob();
		//v.shwnobob();
		//v.viewuploaddoc();
		//v.nte("txt");
	}
}