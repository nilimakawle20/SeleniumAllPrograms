/*Difference between quit & close method in Selenium?*/
package selenium.launchbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class C43_CloseQuit {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	//driver.close(); //running program with this method gives java.net.SocketException and it closes parent tab/window
	driver.quit(); //closes parent and child tab/window
	}
}
