package selenium.dropdowns;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C46_AmazonBooks {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();	
		WebElement e1=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(e1);
		//s1.selectByVisibleText("Books"); //selectByVisibleText
		
		//s1.selectByValue("search-alias=appliances");  //selectByValue - appliances by its value
		
		s1.selectByIndex(1); //selectByIndex -index starts from 0,1 and so on
			
	}

}
