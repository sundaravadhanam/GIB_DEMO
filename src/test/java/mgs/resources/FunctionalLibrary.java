package mgs.resources;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FunctionalLibrary {
public static WebDriver driver;
public void launchBrowser(String url) {
	System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.get(url);
	driver.manage().window().maximize();
	
}

public  void  insertText(WebElement element, String value) {
	element.sendKeys(value);
}

public void click(WebElement element) {
	element.click();
}

public void screenShot() throws Throwable {
	Date d = new Date();
	@SuppressWarnings("deprecation")
	int e = d.getSeconds();
TakesScreenshot ts =  (TakesScreenshot)driver;	
File source = ts.getScreenshotAs(OutputType.FILE);
File dest = new File(".//ScreenShots//mgs"+e+".png");
FileUtils.copyFile(source, dest);
}

public void scrollDown(WebElement element) {
	JavascriptExecutor j = (JavascriptExecutor)driver;
	j.executeScript("arguments[0].scrollIntoView(true)", element);
}
public void scrollUp(WebElement element) {
	JavascriptExecutor j = (JavascriptExecutor)driver;
	j.executeScript("arguments[0].scrollIntoView(false)", element);
}
public void dropDownIndex(WebElement element, int index) {
	Select s = new Select(element);
	s.selectByIndex(index);
}
public void enter() throws Throwable {
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
}
}
