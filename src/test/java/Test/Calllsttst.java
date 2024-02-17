package Test;

import org.testng.annotations.Test;

import Pages.CallList;
import Pages.ViewLeadsAgentPage;

public class Calllsttst extends Baseclass{
@Test
public void tstcalllst()
{

	ViewLeadsAgentPage v = new ViewLeadsAgentPage(driver);
	v.aria();
	CallList cl= new CallList(driver);
	cl.calllist();
}
}
