package Test;

import org.testng.annotations.Test;

import Pages.Purchaseddata;
import Pages.ViewLeadsAgentPage;



public class Purchaseddatatst extends Baseclass {
@Test
public void tstprchseddta() 
{
	ViewLeadsAgentPage v = new ViewLeadsAgentPage(driver);
	v.aria();
	Purchaseddata p = new Purchaseddata(driver);
	p.purchsed();
	p.actions();
	p.move();
	p.search();
	p.status();
	p.printslcted();
	p.dwnld();
	p.buttn();
}
}
