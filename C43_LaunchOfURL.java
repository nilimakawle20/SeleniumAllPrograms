/*How to launch any website?*/
package selenium.launchbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class C43_LaunchOfURL {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/"); //launches website

	}

}
