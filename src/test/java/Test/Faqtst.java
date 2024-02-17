package Test;

import org.testng.annotations.Test;

import Pages.FAQ;
import Pages.ViewLeadsAgentPage;

public class Faqtst extends Baseclass{
@Test
public void tstfaq()
{
	ViewLeadsAgentPage v = new ViewLeadsAgentPage(driver);
	v.aria();
	FAQ f = new FAQ(driver);
	f.faqpg();
}
}
