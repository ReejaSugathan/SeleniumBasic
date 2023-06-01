package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorMethod {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Reeja Sugathan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		WebElement alertsAndModals=driver.findElement(By.xpath("//a[@id='alert-modal']"));
		alertsAndModals.click();
		WebElement bootstrapAlert=driver.findElement(By.xpath("//li[@class='list-group-item']//a[@href='bootstrap-alert.php']"));
												// x path from parent 
		bootstrapAlert.click();
		WebElement bootstrapModal=driver.findElement(By.xpath("//*[text()='Bootstrap Modal']"));
												//using text() method
		bootstrapModal.click();
		driver.navigate().back();
		WebElement windowPopup=driver.findElement(By.xpath("//*[contains(text(),'Window Popup')]"));
												// using contains-text
		windowPopup.click();
		driver.navigate().back();
		WebElement progressBarModal=driver.findElement(By.xpath("//*[contains(@href,'modal-progress.php')]"));
												// using contains-Attribute partial value
		progressBarModal.click();
		driver.navigate().back();
		WebElement javascriptAlert=driver.findElement(By.xpath("//*[starts-with(@href,'javascript-alert')]"));
												// using start-with partial value at starting using attribute
		javascriptAlert.click();
		driver.navigate().back();
		WebElement fileDownload=driver.findElement(By.xpath("//*[starts-with(text(),'File')]"));
												// using start-with:text
		fileDownload.click();
		driver.navigate().back();
		
		
	}

}
