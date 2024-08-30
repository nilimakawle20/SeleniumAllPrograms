/*How we can maximize and minimize windows or tab?*/
package selenium.launchbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class C43_MaximizeMinimize {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize(); //maximize screen
	    Thread.sleep(5000);
		driver.manage().window().minimize(); //maximize screen
	}

}
