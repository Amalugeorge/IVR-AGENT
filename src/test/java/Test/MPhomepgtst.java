package Test;

import org.testng.annotations.Test;

import Pages.MPSearch;
import Pages.MPhomepge;

public class MPhomepgtst extends Baseclass{
@Test
public void tsthmpge()
{
	MPSearch ms = new MPSearch(driver);
	ms.mrp();
	MPhomepge hp = new MPhomepge(driver);
	hp.hmepg();
}
}
