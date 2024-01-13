package com.easyjobs.qa.testcases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.easyjobs.qa.base.TestBase;
import com.easyjobs.qa.pages.HomePage;
import com.easyjobs.qa.pages.LoginPage;
import com.easyjobs.qa.util.TestUtil;

public class LoginPageTest extends TestBase {

	
	LoginPage loginPage;
	HomePage homePage;
	
	
	public LoginPageTest(){
	
		super();
		
		
	}
	
	@BeforeMethod
	
	public void setUp(){
		
		initialization();
		loginPage = new LoginPage();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
	}	

@Test (priority=1)
public void validateLoginPageTitle()

{
	String title = loginPage.validateLoginPageTitle();
	Assert.assertEquals(title, prop.getProperty("loginPageTitle"));
	
	
}

@Test (priority=2)

public void loginPageImageTest(){
		boolean flag = loginPage.validateLoginpageImage();
		Assert.assertTrue(flag);
		
		
	}

@Test (priority=3)
	
public void loginTest(){
		
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		

	}	
	

@AfterMethod
	
	public void tearDown(){
	
	driver.quit();
	}
	
	
	
	
	
	
}
