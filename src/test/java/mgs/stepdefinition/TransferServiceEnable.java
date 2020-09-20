package mgs.stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import mgs.objrepo.HomePage;
import mgs.objrepo.LoginPage;
import mgs.objrepo.ManageCustomerPage;
import mgs.objrepo.MenuPage;
import mgs.objrepo.ProductServicePage;
import mgs.objrepo.ServicePage;
import mgs.resources.FunctionalLibrary;

public class TransferServiceEnable extends FunctionalLibrary{
	FunctionalLibrary f = new FunctionalLibrary();
	 LoginPage l = new LoginPage();
	@Given("Login into the Admin portal")
	public void login_into_the_Admin_portal(DataTable datavalue) {
	  
	   List<String> data= datavalue.asList();
	   insertText(l.getUserName(), data.get(0));
	   insertText(l.getPassWord(), data.get(1));
	}

	@Given("Click on the authenticate button")
	public void click_on_the_authenticate_button() throws Throwable {
	  click(l.getAuthenticateButton());
	  screenShot();
	}

	@When("Navigate to the Customer Master")
	public void navigate_to_the_Customer_Master() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	   HomePage ho = new HomePage();
	   click(ho.getMenuBtn());
	   MenuPage Me = new MenuPage(); 
	   click(Me.getCustomerManag());
	   click(Me.getCusterMas());
	}

	@When("Search for the ECORP and Select")
	public void search_for_the_ECORP_and_Select() throws Throwable {
	ManageCustomerPage mc = new ManageCustomerPage(); 
	   dropDownIndex(mc.getQueueDropdown(), 2);
	   insertText(mc.getSearchTextBOXGCIF(), "ECORP");
	   enter();
	   List<WebElement> fi = driver.findElements(By.xpath("//a[@class='viewCust k-link']"));
		for (int i = 0; i <fi.size() ; i++) {
			WebElement we = fi.get(i);
			String te = we.getText();
			
			if(te.equals("ECORP")) {
				we.click();
				System.out.println(te);
			}
		}
	   
	}

	@When("Edit and Enable the transfer service in the Product service")
	public void edit_and_Enable_the_transfer_service_in_the_Product_service() {
     driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	 ServicePage ser =  new ServicePage();
	 click(ser.getService());
	 ProductServicePage prod = new ProductServicePage();
	 prod.scrollDown(prod.getScrollDown());
	 prod.click(prod.getEndBtn());
	 ServicePage serv =  new ServicePage();
	 click(serv.getService());
	 ProductServicePage pro = new ProductServicePage();
	 pro.click(pro.getEippDis());
	 ProductServicePage pro1 = new ProductServicePage();
	 pro.click(pro1.getWpsksaDis());
	 ProductServicePage pro2 = new ProductServicePage();
	 pro.click(pro2.getRcdDis());
	 ProductServicePage pro3 = new ProductServicePage();
	 pro.click(pro3.getImrDis());
	 ProductServicePage pro4 = new ProductServicePage();
	 pro.click(pro4.getH2hDis());
	 ProductServicePage pro5 = new ProductServicePage();
	 pro.click(pro5.getVaDis());
	 ProductServicePage pro6 = new ProductServicePage();
	 pro.click(pro6.getWpsuaeDis());
	}

	@Then("Do not enter the mandatory fields and submit")
	public void do_not_enter_the_mandatory_fields_and_submit() {
	  
	}

	@Then("Validate the outcome")
	public void validate_the_outcome() {
	   
	}

	@Given("Login into the Admin portal - positive")
	public void login_into_the_Admin_portal_positive(DataTable data) {

	}

	@Given("Click on the authenticate button- positive")
	public void click_on_the_authenticate_button_positive() {
	    
	}

	@When("Navigate to the Customer Master- positive")
	public void navigate_to_the_Customer_Master_positive() {
	  
	}

	@When("Search for the ECORP and Select- positive")
	public void search_for_the_ECORP_and_Select_positive() {
	  
	}

	@When("Edit and Enable the transfer service in the Product service- positive")
	public void edit_and_Enable_the_transfer_service_in_the_Product_service_positive() {
	    
	}

	@Then("Enter the mandatory fields and submit- positive")
	public void enter_the_mandatory_fields_and_submit_positive() {
	   
	}

	@Then("Validate the outcome- positive")
	public void validate_the_outcome_positive() {
	    
	}


}
