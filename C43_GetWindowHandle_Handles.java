/*Getwindowhandle vs getwindowhandles method in selenium?*/
package selenium.launchbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class C43_GetWindowHandle_Handles {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(driver.getWindowHandle()); //gives you browser id of parent browser/tab
		System.out.println(driver.getWindowHandles()); //gives you browser id of parent and child browser/tab
	}

}
