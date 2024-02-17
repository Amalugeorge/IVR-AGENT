package Test;

import org.testng.annotations.Test;

import Pages.Communication;
import Pages.Communicationsavedaddrpay;
import Pages.ViewLeadsAgentPage;



public class Communicationsavedaddrpaytest extends Baseclass{
	@Test
	public void tstcm()
	{
		ViewLeadsAgentPage v = new ViewLeadsAgentPage(driver);
		v.aria();
		Communication c = new Communication(driver);
		c.edit();
		c.calls("1");
		Communicationsavedaddrpay cs = new Communicationsavedaddrpay(driver);
		cs.alreadyentraddr("123");
	}

}
