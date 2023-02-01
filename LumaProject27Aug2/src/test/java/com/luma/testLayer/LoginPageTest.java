package com.luma.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.luma.pageLayer.HomePage;
import com.luma.pageLayer.LoginPage;
import com.luma.testBase.TestBase;

public class LoginPageTest extends TestBase {

	@Test
	public void verifyLoginTest() throws InterruptedException
	{
		String expected_result = "Welcome ";
		
		home_obj.clickOnLoginLink();
		login_obj.enterUsername(read_data.readData("Login Data", 1, 0));
		login_obj.enterPassword(read_data.readData("Login Data", 1, 1));
		login_obj.clickOnLoginButton();
		Thread.sleep(4000);
		logger.info("User logged into the application");
		String actual_output = login_obj.getLoginStatus();
		Assert.assertEquals(actual_output, expected_result);
	}
}
