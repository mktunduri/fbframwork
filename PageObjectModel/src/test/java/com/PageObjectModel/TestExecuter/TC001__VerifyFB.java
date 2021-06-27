package com.PageObjectModel.TestExecuter;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.PageModel.Pageobjects.FbPageObjects;
import TestBase.TestBasePOM;

public class TC001__VerifyFB extends TestBasePOM {

	@Test
	public void verificatoion() throws InterruptedException {
		FbPageObjects fbobj = new FbPageObjects(driver);
		fbobj.FbUseroperations();
		Thread.sleep(6000);
		driver.close();

	}

	@BeforeMethod
	public void openchrome() {
		launcher();

	}

}
