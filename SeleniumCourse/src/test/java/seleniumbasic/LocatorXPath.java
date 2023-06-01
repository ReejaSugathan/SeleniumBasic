package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXPath {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Reeja Sugathan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement inputForm=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputForm.click();
		
		WebElement checkboxDemo=driver.findElement(By.xpath("//a[@href='check-box-demo.php']"));
		checkboxDemo.click();
		//WebElement checkBoxOne=driver.findElement(By.xpath("//input[@id='check-box-one']"));   
											// using id basic syntax
		WebElement checkBoxOne=driver.findElement(By.xpath("(//input[@class='check-box-list'])[1]")); 
											//using class indexes
		//WebElement checkBoxOne=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/div/div[1]/input"));
		                                    //using absalute xpath
		checkBoxOne.click();
		
	}

}
