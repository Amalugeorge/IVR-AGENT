package Test;

import org.testng.annotations.Test;

import Pages.Logintomp;
import Pages.ViewLeadsAgentPage;

public class Loginmptst extends Baseclass{
@Test
public void tstlgnmp()
{
	ViewLeadsAgentPage v = new ViewLeadsAgentPage(driver);
	v.aria();
	Logintomp l = new Logintomp(driver);
	l.lgnmp();
}
}
