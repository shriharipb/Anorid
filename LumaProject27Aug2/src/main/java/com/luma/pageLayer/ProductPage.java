package com.luma.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.testBase.TestBase;

public class ProductPage extends TestBase{

	public ProductPage()
	{
		PageFactory.initElements(driver, this);
	}
	//-------------- Obj repo -----------------
	
	@FindBy(xpath="//a[contains(text(),'Add to cart')]")
	private WebElement add_to_cart_btn;
	
	// ------------- Action methods -----------
	public void clickOnAddToCartButton()
	{
		add_to_cart_btn.click();
	}
	
	
	
	
}
