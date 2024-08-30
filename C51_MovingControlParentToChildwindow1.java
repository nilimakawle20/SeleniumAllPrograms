/*How to move control from Parent to Child Window*/
package selenium.switchcontrol;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C51_MovingControlParentToChildwindow1 {

public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in");
driver.manage().window().maximize();
WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
e1.sendKeys("shoe");
e1.sendKeys(Keys.ENTER);
WebElement shoe_45=	driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[45]"));
shoe_45.click(); //clicking 45th shoe
		
Set<String> ids=driver.getWindowHandles();//parent and child id
Iterator<String> id=ids.iterator();
String parentid=id.next(); //parent id
String childid=id.next();  //1st child id
Thread.sleep(2000);
driver.switchTo().window(childid); //move the control from parent to child window
driver.close();
}
}
