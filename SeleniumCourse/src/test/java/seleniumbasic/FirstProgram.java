package seleniumbasic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class FirstProgram {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Reeja Sugathan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		
		//System.setProperty("webdriver.edge.driver","C:\\Users\\Reeja Sugathan\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		//driver.get("https://selenium.obsqurazone.com/index.php");
		
		//System.out.println(driver.getTitle());
		String result=driver.getTitle();
		System.out.println(result);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		
		//driver.close();
		
		driver.quit();
	}

}
