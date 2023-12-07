package Method;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Seleni {

	public static void main (String[]args) throws Throwable {  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SampleProject\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.filpkart.com/");
	driver.manage().window().maximize();
	
	WebElement ele =driver.findElement(By.xpath("//span[@role='button']")); //close login
	ele.click();
	
	driver.findElement(By.name("q")).sendKeys("Redmi Mobiles",Keys.ENTER);
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	WebElement element =driver.findElement(By.xpath("//span[@class='B_NuCI']"));
	String text = element.getText();
	System.out.println(text);
	
	}
}

	
	
	
//	driver.findElement(By.id("alertButton")).click();
//	Alert a = driver.switchTo().alert();
//	String text =a.getText();
//	System.out.println(text);
//	a.accept();
//	
//	driver.findElement(By.id("confirmButton")).click();
//	String text1 =a.getText();
//	System.out.println(text1);
//	a.dismiss();
	
//	TakesScreenshot tk = (TakesScreenshot)driver;
//	File src =tk.getScreenshotAs(OutputType.FILE);
//	File des = new File ("C:\\Users\\ELCOT\\eclipse-workspace\\SampleProject\\target\\alter.png");
//	FileUtiles.copyFile(src,des);
	
	
	
	

	
	
//    WebElement src=driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
//    WebElement des=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
//    
//    WebElement dep=driver.findElement(By.xpath("(//a[contains(text(),'5000')])[2]"));
//    WebElement sale=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
//    
//    WebElement bu=driver.findElement(By.xpath("//a[contains(text(),'SALES')]"));
//    WebElement dis=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
//    
//    WebElement sc=driver.findElement(By.xpath("(//a[contains(text(),'5000')])[4]"));
//    WebElement es=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
    
   //  driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	//		Runtime.getRuntime().exec("D:\\jas\\fi.exe");
//			
	
		
//		WebElement elem =driver.findElement(By.id("email"));
////		
//		Actions ac =new Actions(driver);
//		ac.dragAndDrop(src, des).build().perform();
//		ac.dragAndDrop(dep, sale).build().perform();
//		ac.dragAndDrop(bu, dis).build().perform();
//		ac.dragAndDrop(sc, es).build().perform();
		
//		ac.sendKeys(elem,"daniel").perform();
//		ac.doubleClick(elem).perform();
//		ac.moveToElement(elem).perform();
//		ac.contextClick(elem).perform();
		
//		Robot rr = new Robot();
//		
//	for(int i=0;i<2;i++) {
//		rr.keyPress(KeyEvent.VK_DOWN);
//		rr.keyRelease(KeyEvent.VK_DOWN);
//	}
//	
//	rr.keyPress(KeyEvent.VK_ENTER);
//	rr.keyRelease(KeyEvent.VK_ENTER);
//	
//	rr.keyPress(KeyEvent.VK_TAB);
//	rr.keyRelease(KeyEvent.VK_TAB);
//	
//	rr.keyPress(KeyEvent.VK_CONTROL);
//	rr.keyPress(KeyEvent.VK_V);
//	rr.keyRelease(KeyEvent.VK_CONTROL);
//	rr.keyRelease(KeyEvent.VK_V);
		
		
		
		
		
		
	
//		WebElement e =driver.findElement(By.xpath("//input[@class='Pke_EE']")); // input click
//		e.click();
//		e.sendKeys("Redmi mobiles");
//		
//		
//		WebElement search =driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']"));  //search
//	search.click();
//	
		
		
	//	List<WebElement> link = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	
//		for(WebElement link1 : link) {
//			String l4 = link1.getText();
//			System.out.println(l4);
//		}
//	List<WebElement> link2 = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
//	      for(WebElement link3 :link2 ) {
//	    	  String lq = link3.getText();
//	    	  System.out.println(lq);
//	      }
	      
//	Map<String,String> con = new LinkedHashMap<>();
//	for(int i=0;i<link.size();i++) {
//		WebElement e1 = link.get(i);
//		String l12 = e1.getText();
//		for(int j=0;j<link2.size();i++) {
//			WebElement e2 = link.get(i);
//			String l13 = e2.getText();
//			con.put(l12, l13);
//	}
//	}
//	Set<Entry<String, String>> entry = con.entrySet();
//	
//	for(Entry<String, String> ent : entry) {
//		System.out.println(ent);
//	}
	
//
//}	
//}
	
