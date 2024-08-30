package selenium.launchbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class C42_Gro {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();

	}

}
