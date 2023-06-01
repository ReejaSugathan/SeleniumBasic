package seleniumbasic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2
{
	public static void main(String[] args)

	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Reeja Sugathan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");

		//WebElement simpleFormDemo=driver.findElement(By.linkText("Simple Form Demo"));

		//WebElement simpleFormDemo1=driver.findElement(By.partialLinkText("Simple Form"));

		//WebElement messageTextBox=driver.findElement(By.cssSelector("input.form-control"));
											// Using class in cssSelector
		  WebElement messageTextBox=driver.findElement(By.cssSelector("input#single-input-field"));  
		  									// Using id in cssSelector
		  messageTextBox.sendKeys("Welcome");

	     //WebElement messageTextBox=driver.findElement(By.cssSelector("input[name=user name]"));
		  									//Using name in cssSelector syntax: ("tag name[name=value of name]")
	WebElement box=driver.findElement(By.tagName("input"));
											// Using tag name.
	}

}
