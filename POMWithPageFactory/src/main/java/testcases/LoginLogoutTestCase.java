package testcases;


import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class LoginLogoutTestCase extends ProjectSpecificMethods{
	
	//@Parameters({"userName","passWord"})
	@Test
	public void LoginLogoutTC() throws InterruptedException {
	new LoginPage(driver,prop)
	.enterUserName()
	.enterPassWord()
	.clickLogin()
	.clickLogout();
	}
}
