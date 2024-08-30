/*Check whether checkbox1 is selected or not*/
package selenium.keysfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C48_IsSelected {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/is-selected/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("(//input[@id='vehicle2'])[1]"));
		Thread.sleep(1000);		
	    //e1.click();     //when clicked,true else false
		boolean b1=e1.isSelected();
		System.out.println(b1);
	}

}
