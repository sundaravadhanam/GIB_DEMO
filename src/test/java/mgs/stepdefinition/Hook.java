package mgs.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import mgs.resources.FunctionalLibrary;

public class Hook extends FunctionalLibrary {

	@Before
	
	public void beforeScenario() {
		launchBrowser("http://14.99.9.58:7005/eCollectIMRAdminPortal/login");
	}
	
	@After
	
	public void afterScenario() {
		/*driver.quit();*/
	}
}
