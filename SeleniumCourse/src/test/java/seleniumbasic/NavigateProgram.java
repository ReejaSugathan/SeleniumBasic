package seleniumbasic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class NavigateProgram {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\Reeja Sugathan\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		
		driver.navigate().to("http://groceryapp.uniqassosiates.com/admin/login");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		

	}

}
