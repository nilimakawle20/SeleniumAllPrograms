/*Login to facebook using xpath*/
package selenium.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C46_LogintoFacebook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("nilimakawle@gmail.com");
		WebElement pwd=driver.findElement(By.xpath("//input[@name='pass']"));
		pwd.sendKeys("Nilima@20");
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
	}

}
