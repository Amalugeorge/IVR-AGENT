package Test;

import org.testng.annotations.Test;

import Pages.Logintocrm;
import Pages.MPSearch;



public class Logintocrmtst extends Baseclass {
@Test
public void tstlgntocrm()
{

	MPSearch ms = new MPSearch(driver);
	ms.mrp();
	Logintocrm c = new Logintocrm(driver);
	c.lgncrm();
}
}
