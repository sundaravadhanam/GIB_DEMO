package mgs.objrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mgs.resources.FunctionalLibrary;

public class HomePage extends FunctionalLibrary {
public HomePage() {
	
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//div[@id='nav-icon1']")
private WebElement menuBtn;


public WebElement getMenuBtn() {
	return menuBtn;
}

}
