package mgs.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import mgs.objrepo.ProductServicePage;
import mgs.objrepo.ServicePage;
import mgs.resources.FunctionalLibrary;

public class Sample extends FunctionalLibrary{
public static void main(String[] args) throws Throwable {
	FunctionalLibrary f = new FunctionalLibrary();
	System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("http://14.99.9.58:7005/eCollectIMRAdminPortal/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='loginIDText']")).sendKeys("300217");
	driver.findElement(By.xpath("//input[@id='passwordText']")).sendKeys("5255454");
    driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
	
	driver.findElement(By.xpath("//div[@id='nav-icon1']")).click();

	driver.findElement(By.xpath("//li[@id='Customer Management']")).click();
	driver.findElement(By.xpath("(//ul)[4]//li[1]")).click();
	WebElement dropdown = driver.findElement(By.id("queue"));
	Select s = new Select(dropdown);
	s.selectByIndex(2);
	driver.findElement(By.xpath("(//input[@class='k-input'])[1]")).sendKeys("ECORP");
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
 List<WebElement> fi = driver.findElements(By.xpath("//a[@class='viewCust k-link']"));
	for (int i = 0; i <fi.size() ; i++) {
		WebElement we = fi.get(i);
		String te = we.getText();
		
		if(te.equals("ECORP")) {
			we.click();
			System.out.println(te);
		}
	}
	/*WebElement table = driver.findElement(By.xpath("(//table)[2]"));
	List<WebElement> trows = table.findElements(By.tagName("tr"));
	for(int i=0;i<trows.size();i++) {
		WebElement row = trows.get(i);
		System.out.println(row.getText());
		List<WebElement> tdata = row.findElements(By.tagName("td"));
		for (int j = 0; j < tdata.size(); j++) {
			WebElement y = tdata.get(j);
			y.click();
		   System.out.println(y.getText());
			String text = y.getText();
			if(text.equals("ECORP")) {
				y.click();
				System.out.println(text);
			}
		}
	}*/
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	 ServicePage ser =  new ServicePage();
	 f.click(ser.getService());
	 ProductServicePage prod = new ProductServicePage();
	 prod.scrollDown(prod.getScrollDown());
	 prod.click(prod.getEndBtn());
	 ServicePage serv =  new ServicePage();
	 f.click(serv.getService());
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
	
	
}
