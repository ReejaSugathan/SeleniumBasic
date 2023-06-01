package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown 
{
public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Reeja Sugathan\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/select-input.php");
	driver.manage().window().maximize();
	
	WebElement ColorDropDown=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
	Select select=new Select(ColorDropDown);
	select.selectByIndex(1);
	select.selectByIndex(2);
	WebElement getAllSelected=driver.findElement(By.xpath("//button[@id='button-all']"));
	getAllSelected.click();
	//select.deselectByIndex(1);
	//select.deselectByIndex(2);
	//select.deselectAll();
	
	
	/* code to select all values from a multi select dropdown.*/
	/* getOptions() - returns the list of all options in the dropdown  */
	System.out.println("Select all values from a multi select dropdown :");		
	
	List <WebElement> allColors = select.getOptions();
	for (WebElement i: allColors)
	{
	System.out.println(i.getText());
	}
	
	
	/* check if it is a multi select dropdown or not.
	  isMultiple() used to return true if multi-select dropdown*/
	
	Boolean result=select.isMultiple();
	System.out.println("check if it is a multi select dropdown or not :"+result);
	
	/* for getting first selected option -- getFirstSelectedOption() */
	
	WebElement firstColor=select.getFirstSelectedOption();
	System.out.println("SELECTED ELEMENT : "+firstColor.getText());
	
	/* for getting all selected option -- getAllSelectedOptions() */
	
	System.out.println("get Select all values from dropdown :");	
	List <WebElement> allSelectedColor = select.getAllSelectedOptions();
	for (WebElement i: allSelectedColor)
	{
	System.out.println(i.getText());
	}
	driver.quit();
	}
}
