package mgs.objrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mgs.resources.FunctionalLibrary;

public class ManageCustomerPage extends FunctionalLibrary {
public  ManageCustomerPage() {
	PageFactory.initElements(driver, this);
}

@FindBy(id="queue")
private WebElement queueDropdown;

@FindBy(xpath="(//input[@class='k-input'])[1]")
private WebElement searchTextBOXGCIF;


public WebElement getQueueDropdown() {
	return queueDropdown;
}

public WebElement getSearchTextBOXGCIF() {
	return searchTextBOXGCIF;
}

}
