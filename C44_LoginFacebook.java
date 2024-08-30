/*WAP to login to facebook with Id and Name locators*/
package selenium.launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C44_LoginFacebook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("nilimakawle@gmail.com");
		WebElement pwd=driver.findElement(By.name("pass"));
		pwd.sendKeys("Nilima@123");
		WebElement login_btn=driver.findElement(By.name("login"));
		login_btn.click();
	}

}
