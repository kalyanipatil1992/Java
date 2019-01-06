import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 
{

	public static void main(String[] args) throws Throwable 
	{
	   
	    System.setProperty("webdriver.gecko.driver","D:\\Softwares\\Gecko Driver\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.toolsqa.com");
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
