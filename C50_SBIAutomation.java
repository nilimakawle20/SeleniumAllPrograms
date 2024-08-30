/*How to automate those website where right click is not allowed?*/
package autosugg.screenshot.javascriptpopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C50_SBIAutomation {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    WebElement link=driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		link.click();
		WebElement un=driver.findElement(By.id("username"));
		un.sendKeys("Utkarsha123");
		WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
     	pwd.sendKeys("Utkarsha@20");
	}

}

//where right click is disable on website either enable it using F12 or CNTL+SHIFT+I