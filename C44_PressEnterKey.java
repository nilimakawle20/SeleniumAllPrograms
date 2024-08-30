/*WAP to launch google & type india & press enter key*/
package selenium.launchbrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class C44_PressEnterKey {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	    Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("India"); // inspect Search field and type india
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER); //press enter key
	}

}
