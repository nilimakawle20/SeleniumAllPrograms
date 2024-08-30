/*WAP to launch google & click on gmail link using linktext/partiallinktext locator*/
package selenium.launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C45_GmailLinkText {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	    Thread.sleep(1000);
	   //WebElement gmail_link=driver.findElement(By.linkText("Gmail")); //inspect link text "Gmail"
	    WebElement gmail_link=driver.findElement(By.partialLinkText("Gma")); //inspect partial link text "Gma"
	    gmail_link.click();

	}

}
