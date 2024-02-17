package Test;

import org.testng.annotations.Test;

import Pages.FAQ;
import Pages.MPFAQ;
import Pages.MPSearch;
import Pages.ViewLeadsAgentPage;

public class MPfaqtst extends Baseclass {
	@Test
	public void tstfaq()
	{
		MPSearch ms = new MPSearch(driver);
		ms.mrp();
		MPFAQ f = new MPFAQ(driver);
		f.faqpg();
	}
	
	
	
}
