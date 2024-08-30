/*Navigation methods*/
package selenium.actions;

import org.openqa.selenium.chrome.ChromeDriver;

public class C47_NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com"); //another way to launch website in browser
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();    
	}

}
