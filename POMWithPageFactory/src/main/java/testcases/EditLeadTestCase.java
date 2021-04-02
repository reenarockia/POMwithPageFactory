package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class EditLeadTestCase extends ProjectSpecificMethods{
	@BeforeTest
	public void setFileName() {
		fileName="datafile";
		sheetNumber="EditLead";
	}
	
	@Test(dataProvider="Data")
	public void EditLeadTC(String firstName,String newCompanyName) throws InterruptedException {
		new LoginPage(driver,prop)
		.enterUserName()
		.enterPassWord()
		.clickLogin()
		.clickCrmsfaLink()
		.clickLeadsLink()
		.clickFindLeadsLink()
		.searchByFirstName(firstName)
		.clickFindLeadsButton()
		.clickFirstResultingLeadId()
		.clickEditButton()
		.clearCompanyName()
		.enterNewCompanyName(newCompanyName)
		.clickUpdateButton()
		.verifyCompanyName(newCompanyName);
	}
	

}
