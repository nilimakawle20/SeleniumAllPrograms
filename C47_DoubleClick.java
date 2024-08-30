/*Launch google.com and do Double Click on gmail*/
package selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class C47_DoubleClick {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	    //WebElement gmail_link=driver.findElement(By.linkText("Gmail")); //inspect link text "Gmail"
		WebElement gmail_link=driver.findElement(By.partialLinkText("Gma"));
		Actions a1=new Actions(driver);
		a1.doubleClick(gmail_link).perform();

	}

}
