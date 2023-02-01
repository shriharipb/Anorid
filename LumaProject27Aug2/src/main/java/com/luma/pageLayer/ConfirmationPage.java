package com.luma.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.testBase.TestBase;

public class ConfirmationPage extends TestBase {

	public ConfirmationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//----------- Obj repo ------------------
	@FindBy(xpath="//h2[contains(text(),'Thank you for your purchase!')]")
	private WebElement status_msg;
	
	public String getStatus()
	{
		return status_msg.getText();
	}
}
