/*Open Amazon.in, search shoes and click on search button*/
package selenium.xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class C46_AmazonShoesSearchButtonClick {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();	
        WebElement e1=	driver.findElement(By.xpath("(//input)[5]")); //xpath for search field
		e1.sendKeys("shoes");
		//e1.sendKeys(Keys.ENTER);
		WebElement e2=	driver.findElement(By.xpath("(//input)[6]")); //xpath for search button
		e2.click();	
	}

}
