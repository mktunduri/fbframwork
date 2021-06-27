package Com.PageModel.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBasePOM;

public class FbPageObjects extends TestBasePOM {
	@FindBy(xpath = "//*[@id='email']")
	WebElement FbId;

	@FindBy(xpath = "//*[@id='pass']")
	WebElement password;

	@FindBy(xpath = "//*[@type='submit']")
	WebElement LoginButton;

	public FbPageObjects(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public void sendsKeysopeartion(WebElement element, String text) {
		element.sendKeys(text);
	}

	public void clickOpeartion(WebElement element) {
		element.click();
	}

	public void FbUseroperations() throws InterruptedException {
		launcher();

		sendsKeysopeartion(FbId, "manikanta.tunduri@gmail.com");
		sendsKeysopeartion(password, "manikanta123");
		clickOpeartion(LoginButton);

	}

		

}
