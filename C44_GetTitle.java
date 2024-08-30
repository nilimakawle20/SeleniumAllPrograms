/*WAP to get the title of any website*/
package selenium.launchbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class C44_GetTitle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle()); //print title of webpage

	}

}