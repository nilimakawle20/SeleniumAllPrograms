/*Select all present address, cpoy it and paste it in permanent address*/
package selenium.keysfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C48_KeysFunction2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();	
		Thread.sleep(2000);
		WebElement present_add= driver.findElement(By.id("Present-Address"));
		present_add.sendKeys("Nagar Colony, dhote ward, Hinganghat-442301");
		
		present_add.sendKeys(Keys.CONTROL+"A");
		present_add.sendKeys(Keys.CONTROL+"C");
		WebElement permanent_add= driver.findElement(By.id("Permanent-Address"));
		permanent_add.sendKeys(Keys.CONTROL+"V");		
}
}
