package com.easyjobs.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.easyjobs.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory - OR:
	
		@FindBy(xpath="//input[@type='email']")
		WebElement username;
		
		@FindBy(xpath="//input[@type='password']")
		WebElement password;
		
		@FindBy(xpath="//button [@type='submit']")
		WebElement loginBtn;
		
		@FindBy(xpath="//button[contains(text(),'Sign In')]")
		WebElement signInBtn;
		
		@FindBy(xpath="//img[contains(@class,'login-page__background')]")
		WebElement loginPageImage;
		
		//Initializing the Page Objects:
		
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public boolean validateLoginpageImage(){
			return loginPageImage.isDisplayed();
		}
		
		public HomePage login(String un, String pwd){
			username.sendKeys(un);
			password.sendKeys(pwd);
		    loginBtn.click();
			    	
			return new HomePage();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

