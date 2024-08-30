/*Absolute xpath with indexing*/
package selenium.launchbrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C45_1stXpath {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/OneDrive/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement un=driver.findElement(By.xpath("(/html/body/input)[1]")); //inspect username
		un.sendKeys("Nilima Kawle");
	}
}
