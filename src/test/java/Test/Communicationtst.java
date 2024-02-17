package Test;

import org.testng.annotations.Test;

import Pages.Communication;
import Pages.ViewLeadsAgentPage;



public class Communicationtst extends Baseclass {
@Test
public void tstcommntn()
{
	ViewLeadsAgentPage v = new ViewLeadsAgentPage(driver);
	v.aria();
	Communication c = new Communication(driver);
	c.edit();
	c.cmctnpg("test","9163850525");
	c.calls("1");
	c.addresspay("sdfask","dskmo","234125455");
	c.card("5424000000000015","abc","122025","234");
}
}
