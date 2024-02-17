package Test;

import org.testng.annotations.Test;

import Pages.MPPurchasedleads;
import Pages.MPSearch;


public class MPpurchasedleadstst extends Baseclass{
	@Test
	public void tstpurchsed() throws InterruptedException
	{
		MPSearch ms = new MPSearch(driver);
		ms.mrp();
		MPPurchasedleads p = new MPPurchasedleads(driver);
		p.purchsed();
		//p.actions();
		//p.move();
		//p.search();
		//p.status();
		//p.printslcted();
		//p.dwnld();
		//p.buttn();
	//	p.addNotes();
	//	p.shwnm();
	//	p.applyfiltrsts();
	//	p.applyfltercmp("M11");
		//p.applyfiltrmrg("5015927");
		//p.applyfiltstate("AL");
		//p.applyfiltrcnty("Saint Clair");
		//p.applyfltrnme("Jennifer");
		//p.downloadapplyfltr("M11", "5015927", "AL", "Saint Clair", "Jennifer");
		//p.silver();
		//p.movesilver();
		//p.statussilver();
		//p.printsilver();
		//p.dwnldsilver();
		//p.addntesilver();
		//p.shwnmsilver();
		//p.applyfiltersilver();
		//p.applyfltercmpsilver("M11092023i(4)");
		//p.applyfiltrmrgsilver("32042018");
		//p.applyfiltstatesilver("al");
	//p.applyfiltrcntysilver("Marshall");
	//	p.applyfltrnmesilver("Teresa");
	//	p.downloadapplyfltrsilver("M11092023i(4)", "32042018", "al", "Marshall", "Teresa");
		//p.bob();
	//	p.addntebob();
		//p.shwnbob();
		
		//p.applyfltrcmgbob("M10192023i");
		//p.applyfiltermrgbob("1806");
		//p.applyfilterstebob("az");
		//p.applyfiltercntybob("Pinal");
		//p.applyfilternmebob("Loius");
		p.downloadapplyfilter("M10192023i", "1806", "az", "Pinal", "Loius");
	
	}
	}