package Greenmouse.DONandChyke;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class adminAddUsers extends reusables {
	WebDriver driver;
	
	@Test
	public void adminActivity() throws InterruptedException
	{
		reusables invoke = new reusables();
		invoke.init();
		invoke.launchAdmin();
		invoke.adminLogin();
		invoke.addManager();
		invoke.addAsstManager();
		invoke.addAccountant();
		
		invoke.closeApp();
	}

}
