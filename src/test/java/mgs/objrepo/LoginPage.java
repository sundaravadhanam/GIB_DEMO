package mgs.objrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mgs.resources.FunctionalLibrary;

public class LoginPage extends FunctionalLibrary {
public LoginPage(){
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//input[@id='loginIDText']")
private WebElement userName;

@FindBy(xpath="//input[@id='passwordText']")
private WebElement passWord;

@FindBy(xpath="//button[@id='loginBtn']")
private WebElement authenticateButton;

public WebElement getUserName() {
	return userName;
}

public WebElement getPassWord() {
	return passWord;
}

public WebElement getAuthenticateButton() {
	return authenticateButton;
}


}
