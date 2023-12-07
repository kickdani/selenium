package Method;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import java.util.*;
public class kick {
	
public static void main(String []args) throws Throwable{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SampleProject\\src\\test\\resources\\chromedriver.exe");
	WebDriver driver  = new ChromeDriver();
	driver.navigate().to("htps\\www.flipkart.com/");
	driver.manage().window().maximize();
	
	
	
	
}
}
