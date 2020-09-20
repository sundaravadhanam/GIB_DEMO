package mgs.objrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mgs.resources.FunctionalLibrary;

public class MenuPage extends FunctionalLibrary{
	
	public MenuPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//li[@id='Customer Management']")
	private WebElement customerManag;

	@FindBy(xpath="(//ul)[4]//li[1]")
	private WebElement custerMas;

	public WebElement getCustomerManag() {
		return customerManag;
	}

	public WebElement getCusterMas() {
		return custerMas;
	}
}
