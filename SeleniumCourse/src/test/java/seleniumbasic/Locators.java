package seleniumbasic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\Reeja Sugathan\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/home");
		
		WebElement searchTextBoxId=driver.findElement(By.id("un"));
	//	WebElement searchTextBoxName=driver.findElement(By.name("un"));
	//	WebElement searchTextBoxClass=driver.findElement(By.className("form-control"));
		
		searchTextBoxId.sendKeys("Apple");
		searchTextBoxId.clear();
		//searchTextBoxId.click();
		
	}

}
