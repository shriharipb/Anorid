package com.luma.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.testBase.TestBase;

public class LoginPage extends TestBase {

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//----------------- Obj repo --------------------------
	@FindBy(xpath="//input[@id='loginusername']")
	private WebElement username_txtbox;
	
	@FindBy(xpath="//input[@id='loginpassword']")
	private WebElement password_txtbox;
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	private WebElement login_btn;
	
	@FindBy(xpath="//a[@id='nameofuser']")
	private WebElement status_msg;
	
	//---------------- Action methods ---------------------
	public void enterUsername(String username)
	{
		username_txtbox.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		password_txtbox.sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		login_btn.click();
	}
	
	public String getLoginStatus()
	{
		String msg = status_msg.getText();
		return msg;
	}
}
