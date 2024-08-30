package selenium.launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C45_XpathBasicsAssignment {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/OneDrive/Desktop/learningHTML1.html"); // ("file:///d/users/abc.html")
		driver.manage().window().maximize();
		WebElement un=driver.findElement(By.xpath("(/html/body/input)[1]")); //xpath for username
		un.sendKeys("Nilima Kawle");
		WebElement hint=driver.findElement(By.xpath("(/html/body/input)[2]")); //xpath for hint
		hint.sendKeys("name@20");
		WebElement pwd=driver.findElement(By.xpath("(/html/body/input)[3]")); //xpath for password
		pwd.sendKeys("Nilima@20");
		WebElement f_name=driver.findElement(By.xpath("((/html/body/form)[1])/input[1]")); //xpath for first name
		f_name.sendKeys("Nilima");
		WebElement chk1=driver.findElement(By.xpath("((/html/body/form)[2])/input[1]")); //xpath for boy
		chk1.click();
		WebElement chk2=driver.findElement(By.xpath("((/html/body/form)[2])/input[2]")); //xpath for girl
		chk2.click();
		WebElement chk3=driver.findElement(By.xpath("((/html/body/form)[2])/input[3]")); //xpath for baby
		chk3.click();
		
		WebElement rb1=driver.findElement(By.xpath("(/html/body/input)[4]")); //xpath for male
		rb1.click();
		WebElement rb2=driver.findElement(By.xpath("(/html/body/input)[5]")); //xpath for female
		rb2.click();
		
		WebElement chk4=driver.findElement(By.xpath("(/html/body/input)[6]")); //xpath for relocate
		chk4.click();
		
		WebElement clk=driver.findElement(By.linkText("Click to know about us")); //inspecting linktext "Click to know about us"
		clk.click();
	}

}
