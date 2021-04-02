package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	//public constructor
	public LoginPage(ChromeDriver driver,Properties prop) {
		this.driver=driver;
		this.prop=prop;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="username") WebElement elementUsername;
	
	public LoginPage enterUserName() throws InterruptedException {
		elementUsername.sendKeys(prop.getProperty("userName"));
		//driver.findElement(By.id(prop.getProperty("LoginPage.username.Id"))).sendKeys(prop.getProperty("userName"));
		Thread.sleep(5000);
		return this;
	}
	@FindBy(how=How.ID,using="password") WebElement elementPassword;
	public LoginPage enterPassWord() {
		elementPassword.sendKeys(prop.getProperty("passWord"));
		//driver.findElement(By.id(prop.getProperty("LoginPage.Password.Id"))).sendKeys(prop.getProperty("passWord"));
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit") WebElement elemenloginButton;
	public HomePage clickLogin() {
		elemenloginButton.click();
		//driver.findElement(By.className(prop.getProperty("LoginPage.LoginButton.Class"))).click();
		return new HomePage(driver,prop);
	}

}
