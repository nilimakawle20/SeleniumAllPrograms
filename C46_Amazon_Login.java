/*WAP to Sign For Amazon.india  Using Relative Xpath*/
package selenium.xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C46_Amazon_Login 
{
public static void main(String[] args)
{
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
driver.manage().window().maximize();	
WebElement email=	driver.findElement(By.xpath("(//input)[7]")); //xpath for email
email.sendKeys("stbymkt@gmail.com");

WebElement cont=driver.findElement(By.xpath("(//input)[10]"));//xpath for continue button
cont.click();

WebElement password=driver.findElement(By.xpath("(//input)[9]"));//xpath for password
password.sendKeys("stbymkt@gmail.com");
	
WebElement signin=	driver.findElement(By.xpath("(//input)[10]"));//xpath for signin
signin.click();	
}
}
