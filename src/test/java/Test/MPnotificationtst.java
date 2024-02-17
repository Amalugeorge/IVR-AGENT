package Test;

import org.testng.annotations.Test;

import Pages.MPSearch;
import Pages.MPnotification;


public class MPnotificationtst extends Baseclass{
@Test
public void tstnotific()
{
	MPSearch ms = new MPSearch(driver);
	ms.mrp();
	MPnotification n = new MPnotification(driver);
	n.ntfcn("ia");
	//n.addntfn();
	n.threedts();
	n.delte();
}
}
