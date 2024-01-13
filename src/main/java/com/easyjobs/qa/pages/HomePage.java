package com.easyjobs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.easyjobs.qa.base.TestBase;

public class HomePage extends TestBase {

	//Page Factory - OR:
	
	@FindBy(xpath="//*[@id=\"appa\"]/div[1]/main/div[2]/section[1]/div/div[1]/a/div[2]/p")
	WebElement activeCandidates;
	
	@FindBy(xpath="//*[@id=\"appa\"]/div[1]/main/div[2]/section[1]/div/div[2]/a/div[2]/p")
	WebElement activeJobs;
	
	@FindBy(xpath="//*[@id=\"appa\"]/div[1]/main/div[2]/section[1]/div/div[3]/a/div[2]/p")
	WebElement draftJobs;
	
	@FindBy(xpath="//*[@id=\"appa\"]/div[1]/main/div[2]/section[1]/div/div[4]/a/div[2]/p")
	WebElement teamMembers;

	@FindBy(xpath="//*[@id=\"appa\"]/div[1]/main/div[2]/section[4]/div[2]/div/div[1]/div[2]/div[5]/a[1]/i")
	WebElement jobView;
	
	@FindBy(xpath="//*[@id=\"appa\"]/div[1]/main/div[2]/section[4]/div[2]/div/div[1]/div[2]/div[5]/a[2]/div/i")
	WebElement jobEdit;
	
	@FindBy(xpath="//*[@id=\"appa\"]/div[1]/main/div[2]/section[4]/div[2]/div/div[1]/div[2]/div[5]/div/a")
	WebElement jobShare;
	
	@FindBy(xpath="//*[@id=\"appa\"]/div[1]/main/div[2]/section[4]/div[2]/div/div[1]/div[2]/div[1]/a")
	WebElement jobPipelinePage;
	
	@FindBy(xpath="//*[@id=\"appa\"]/div[1]/main/div[2]/section[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/p/a")
	WebElement jobCandidatesPage;
	
	@FindBy(xpath="//*[@id=\"appa\"]/div[1]/main/div[2]/section[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/button/i")
	WebElement jobAnalyticsData;
	
	@FindBy(xpath="//*[@id=\"appa\"]/div[1]/main/div[1]/header/div[1]/a/span")
	WebElement viewCompanyJobPage;
	


	//Initializing the Page Objects:
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions:
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
