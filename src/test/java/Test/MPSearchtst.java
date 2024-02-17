package Test;

import org.testng.annotations.Test;

import Pages.MPSearch;
import Pages.ViewLeadsAgentPage;

public class MPSearchtst extends Baseclass{
@Test
public void tstsrch()
{
	MPSearch ms = new MPSearch(driver);
	ms.mrp();
	ms.srch("809");
}
}
