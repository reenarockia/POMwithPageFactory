package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;
import pages.ViewLeadPage;

public class DeleteLeadTestCase extends ProjectSpecificMethods{
	@BeforeTest
	public void setFileName() {
		fileName="datafile";
		sheetNumber="DeleteLead";
	}
	
	@Test(dataProvider="Data")
	public void DeleteLeadTC(String phoneNumber) throws InterruptedException {
		new LoginPage(driver, prop)
		.enterUserName()
		.enterPassWord()
		.clickLogin()
		.clickCrmsfaLink()
		.clickLeadsLink()
		.clickFindLeadsLink()
		.searchByPhoneNumber(phoneNumber)
		.clickFindLeadsButton()
		.clickFirstResultingLeadId()
		.storeOriginalLeadId()
		.clickDeleteButton()
		.clickFindLeadsLink()
		.searchByLeadId(originalLeadIdFromViewLeadPage)
		.clickFindLeadsButton()
		.verifyNoRecordsFoundMessageDisplay();
	}

}
