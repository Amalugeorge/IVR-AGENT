package Test;

import org.testng.annotations.Test;

import Pages.Search;
import Pages.ViewLeadsAgentPage;

public class Searchtst extends Baseclass{
	@Test
	public void tstsrch()
	{
		ViewLeadsAgentPage v = new ViewLeadsAgentPage(driver);
		v.aria();
		Search s = new Search(driver);
		s.srch("802");
	}

}
