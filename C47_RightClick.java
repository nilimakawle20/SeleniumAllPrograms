/*Launch google.com and Right click on gmail link*/
package selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C47_RightClick {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement gmail_link=driver.findElement(By.linkText("Gmail")); //inspect link text "Gmail"
		Actions a1=new Actions(driver);
		a1.contextClick(gmail_link).perform(); //right click on gmail link
	}

}
