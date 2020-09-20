package mgs.objrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mgs.resources.FunctionalLibrary;

public class ProductServicePage  extends FunctionalLibrary{
public ProductServicePage() {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//button[@id='editCust']")
private WebElement scrollDown;

@FindBy(xpath="//button[@id='editCust']")
private WebElement endBtn;

@FindBy(xpath="//input[@id='Additional_2']")
private WebElement vaDis;

@FindBy(xpath="//input[@id='Additional_3']")
private WebElement imrDis;

@FindBy(xpath="//input[@id='Additional_4']")
private WebElement eippDis;

@FindBy(xpath="//input[@id='Additional_11']")
private WebElement h2hDis;

@FindBy(xpath="//input[@id='Additional_14']")
private WebElement wpsksaDis;

@FindBy(xpath="//input[@id='Additional_15']")
private WebElement wpsuaeDis;

@FindBy(xpath="//input[@id='Additional_50']")
private WebElement rcdDis;

@FindBy(xpath="(//select[@name='scanningBy'])[1]")
private WebElement paymentAdviceUpload;

public WebElement getScrollDown() {
	return scrollDown;
}

public WebElement getEndBtn() {
	return endBtn;
}

public WebElement getVaDis() {
	return vaDis;
}

public WebElement getImrDis() {
	return imrDis;
}

public WebElement getEippDis() {
	return eippDis;
}

public WebElement getH2hDis() {
	return h2hDis;
}

public WebElement getWpsksaDis() {
	return wpsksaDis;
}

public WebElement getWpsuaeDis() {
	return wpsuaeDis;
}

public WebElement getRcdDis() {
	return rcdDis;
}




}
