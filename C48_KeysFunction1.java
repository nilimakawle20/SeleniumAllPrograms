/*Launch amazon india, select category as books and search for POWER OF YOUR SUBCONSIOUS MIND*/
package selenium.keysfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C48_KeysFunction1 {
	public static void main(String[] args) throws InterruptedException {
	    ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();	
		Thread.sleep(2000);
		WebElement e1= driver.findElement(By.id("searchDropdownBox")); //webelement search button All dropdown
		for(int i=1;i<=12;i++)
		{
			Thread.sleep(500);
			e1.sendKeys(Keys.ARROW_DOWN); //keys down, down
		}
		WebElement book= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		book.sendKeys("The Power of your subconscious mind");
		book.sendKeys(Keys.ENTER);
		
	}

}

