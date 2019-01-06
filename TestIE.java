

import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestIE {

	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.ie.driver","D:\\Softwares\\IE Driver\\IEDriverServer.exe");

		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("https://www.toolsqa.com");
		Thread.sleep(5000);
		driver.quit();

	}

}
