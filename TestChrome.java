import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChrome {

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\Chrome Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com");
		Thread.sleep(5000);
		driver.quit();
	}

}
