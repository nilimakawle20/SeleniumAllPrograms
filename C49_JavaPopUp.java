/*How to handle javascript popup*/
package autosugg.screenshot.javascriptpopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C49_JavaPopUp {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.manage().window().maximize();	
		WebElement e1= driver.findElement(By.xpath("//button[.='Click ']"));
		e1.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept(); //accept the javascript popup alert
		//e1.click();
		}

}



/*Running this program gives exception without accepting alert- org.openqa.selenium.UnhandledAlertException:*/