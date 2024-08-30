/*Locating element with cssSelector*/
package selenium.css;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C52_CSSonGoogle {

public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.manage().window().maximize();
//WebElement e1=driver.findElement(By.cssSelector("#APjFqb")); //with id{#id_value}
//WebElement e1=driver.findElement(By.cssSelector(".gLFyf")); //with classname{.className}
//WebElement e1=driver.findElement(By.cssSelector("textarea#APjFqb")); //with tagname and id{TN#ID}
//WebElement e1=driver.findElement(By.cssSelector("textarea.gLFyf")); //with tagname and classname{TN.CN}
//WebElement e1=driver.findElement(By.cssSelector("[name='q']")); //with ATTRIBUTE name and value{[AN='AV']}
//WebElement e1=driver.findElement(By.cssSelector("textarea.gLFyf[name='q']")); //with tagname, classname and Attribute{TN.CN[AN='AV']}
WebElement e1=driver.findElement(By.cssSelector("textarea[id^='APj']")); //with carrot and substring{TN[AN^='AV']}
e1.sendKeys("India");
e1.sendKeys(Keys.ENTER);	
}
}
