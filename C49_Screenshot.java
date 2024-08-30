package autosugg.screenshot.javascriptpopups;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class C49_Screenshot {

public static void main(String[] args) throws InterruptedException, IOException {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
Thread.sleep(1000);
		
TakesScreenshot ts=driver; //upcasting driver to TakeScreenshot interface
File source=ts.getScreenshotAs(OutputType.FILE); //using its abstract method getScreenshotAs whose return type is File
File destination=new File("C:\\Users\\DELL\\OneDrive\\Desktop\\nilima"+Math.random()+".png"); //create object of file and pass location of file where you wish to store the screenshot 
FileHandler.copy(source, destination); //FileHandler class copies file from source to destination and copy is static method

	}

}
