package TestBase;

import org.apache.tools.ant.taskdefs.optional.j2ee.GenericHotDeploymentTool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBasePOM {
	public static WebDriver driver;

	public void launcher() {
		// System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
		// + "\\Drivers\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		// WebDriverManager.iedriver().setup();
		// driver =new InternetExplorerDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("manikanta.tunduri@gmaill.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("manikanta123");
		driver.findElement(By.xpath("//*[@type='submit'] ")).click();
		driver.close();

	}

	public static void main(String[] args) {
		TestBasePOM obj = new TestBasePOM();
		obj.launcher();

	}

}
