package seleniumbasic;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebElementCommands 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Reeja Sugathan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		driver.manage().window().maximize();
		
		WebElement logo=driver.findElement(By.xpath("(//img[@alt='logo'])[1]"));
		boolean logoResult=logo.isDisplayed();
		System.out.println("Logo Present or not : "+logoResult);
		
		WebElement checkBox=driver.findElement(By.xpath("//input[@id='invalidCheck']"));
		boolean checkBoxResult=checkBox.isSelected();
		System.out.println("CheckBox Selected or not : "+checkBoxResult);
		
		WebElement firstName=driver.findElement(By.xpath("//label[text()='First name']"));
		String value=firstName.getText();
		System.out.println("GET TEXT : "+value);
		
		String fontFamily=firstName.getCssValue("font-family");
		System.out.println("Font-Family : "+fontFamily);
		
		String fontSize=firstName.getCssValue("font-size");
		System.out.println("Font-Size : "+fontSize);
		
		Dimension size=firstName.getSize();
		System.out.println("Get size : "+size);
		
		Point location=firstName.getLocation();
		System.out.println("Get Location : "+location);
		
		String tagName=firstName.getTagName();
		System.out.println("Tag Name : "+tagName);
		
		String attribute=firstName.getAttribute("for");
		System.out.println("Attribute Type for : "+attribute);
		
		WebElement button=driver.findElement(By.xpath("//button[text()='Submit form']"));
		button.submit();
		
		//driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		//WebElement femaleButton=driver.findElement(By.xpath("//input[@name='inlineRadioOptions']"));
		//boolean female=femaleButton.isEnabled();
		//System.out.println("Female Selected or not : "+female);
		
		driver.quit();
		
	}

}
