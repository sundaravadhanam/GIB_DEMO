package mgs.objrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mgs.resources.FunctionalLibrary;

public class ServicePage extends FunctionalLibrary {
public ServicePage() {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="(//a[@class='tabClick'])[3]")
private WebElement Service;

public WebElement getService() {
	return Service;
}


}
