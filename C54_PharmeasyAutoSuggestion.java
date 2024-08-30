/*WAP to Print all options of auto suggestion*/
package autosugg.screenshot.javascriptpopups;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class C54_PharmeasyAutoSuggestion {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://pharmeasy.in/");
	driver.manage().window().maximize();
	WebElement s1=driver.findElement(By.xpath
	  ("//div[@class='c-PJLV c-bXbWpx c-bXbWpx-joLzpF-justify-center c-bXbWpx-joJbDg-align-center c-bXbWpx-igKcZLf-css']"));
	s1.click(); //click on Search button
	WebElement s2=driver.findElement(By.id("topBarInput"));
	s2.sendKeys("soaps"); //type in input bar
	Thread.sleep(5000);

	List<WebElement> auto=driver.findElements(By.xpath
		("//div[@class='c-PJLV c-bXbWpx c-bXbWpx-bZJlhX-direction-column c-bXbWpx-iieFQlv-css']/div/a"));
	int count=auto.size(); //autosuggestion size
	System.out.println(count); //autosuggestion count
	for(int i=0;i<count;i++)
	{
	WebElement e3=auto.get(i);  //get index of autosuggestion
	System.out.println(e3.getText()); //autosuggestion text
	}
}
}
