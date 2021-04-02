package testcases;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateLeadTestCase extends ProjectSpecificMethods {
	@BeforeTest
	public void setFileName() {
		fileName="datafile";
		sheetNumber="CreateLead";
	}
	
	@Test(dataProvider="Data")
	public void CreateLeadTC(String Company,String FirstName,String LastName,String emailId,String PhoneNumber) throws InterruptedException {
		new LoginPage(driver,prop)
		.enterUserName()
		.enterPassWord()
		.clickLogin()
		.clickCrmsfaLink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName(Company)
		.enterFirstName(FirstName)
		.enterLastName(LastName)
		.enterEmailId(emailId)
		.enterPhoneNumber(PhoneNumber)
		.clickCreateLeadButton()
		.verifyFirstName(FirstName);
	}

}