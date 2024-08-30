/*Autosuggestion find first autosuggestion*/
package autosugg.screenshot.javascriptpopups;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C50_AmazonAutosuggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		Thread.sleep(2000);
		
		List<WebElement> auto=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count=auto.size();
		System.out.println(count);
		auto.get(count-10).click(); // to find first autosuggestion give index (count-10) as index starts from 0 and last[count-1]
	}
}
