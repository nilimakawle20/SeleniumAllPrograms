/*How to handle javascript popup*/
package autosugg.screenshot.javascriptpopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C49_HTMLPopup {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/OneDrive/Desktop/learningHTML1.html");
		Thread.sleep(2000);
		driver.switchTo().alert().accept(); //accept the javascript popup alert
		WebElement e2=driver.findElement(By.name("fname"));
		e2.sendKeys("Nilima");
	}
}
