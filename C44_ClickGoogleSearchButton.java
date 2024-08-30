/*WAP to launch google & type india & click Google Search*/
package selenium.launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class C44_ClickGoogleSearchButton {

public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
    Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("India"); // inspect Search field and type india
	driver.findElement(By.name("btnK")).click(); //gives exception org.openqa.selenium.ElementNotInteractableException
	}
}