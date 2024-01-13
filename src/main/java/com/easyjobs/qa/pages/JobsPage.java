package com.easyjobs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.easyjobs.qa.base.TestBase;

public class JobsPage extends TestBase {

	//Page Factory - OR:
	
			@FindBy(xpath="//*[@id=\"appa\"]/div[1]/section/div/nav/ul/li[2]/a/div[1]")
			WebElement jobs;
			
			@FindBy(xpath="//*[@id=\"appa\"]/div[1]/main/div[2]/section/div[1]/form/a")
			WebElement createAJobPost;
			
			@FindBy(xpath="//*[@id=\"job-title\"]//div[2]")
			WebElement jobTitle;
			
			@FindBy(xpath="//*[@id=\"job-details\"]/div[2]")
			WebElement jobDetails;
			
			@FindBy(xpath="//*[@id=\"appa\"]/div[1]/main/div[2]/section/div[2]/form/div[1]/div/div[2]/ul/li[2]/a")
			WebElement responsibilites;

			@FindBy(xpath="//*[@id=\"job-details\"]/div[2]/p")
			WebElement jobResponsibilities;
			
			@FindBy(xpath="")
			WebElement selectCategpory;

			@FindBy(xpath="")
			WebElement jobExxpiryDate;

			@FindBy(xpath="")
			WebElement jobType;


			
			
			
			

			

			//Initializing the Page Objects:
			
			public JobsPage(){
				PageFactory.initElements(driver, this);
			}

























}






