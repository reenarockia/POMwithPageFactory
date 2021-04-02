package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class DuplicateLeadTestCase extends ProjectSpecificMethods{
	
	
		@BeforeTest
		public void setFileName() {
			fileName="datafile";
			sheetNumber="DuplicateLead";
		}
		
		@Test(dataProvider="Data")
		public void DuplicateLeadTC(String emailId,String firstName) throws InterruptedException {
			new LoginPage(driver,prop)
			.enterUserName()
			.enterPassWord()
			.clickLogin()
			.clickCrmsfaLink()
			.clickLeadsLink()
			.clickFindLeadsLink()
			.searchByEmailId(emailId)
			.clickFindLeadsButton()
			.clickFirstResultingLeadId()
			.clickDuplicateLeadButton()
			.clickCreateLeadButton()
			.verifyFirstName(firstName);
		}

}
