package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	//public parameterized constructor
	public HomePage(ChromeDriver driver,Properties prop) {
		this.driver=driver;
		this.prop=prop;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit") WebElement elementLogoutButton;
	public LoginPage clickLogout() {
		elementLogoutButton.click();
		//driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver,prop);
	}
	@FindBy(how=How.LINK_TEXT,using="CRM/SFA") WebElement elementCrmsfaLink;
	public MyHomePage clickCrmsfaLink() {
		elementCrmsfaLink.click();
		//driver.findElement(By.linkText(prop.getProperty("HomePage.CrmsfaLink.LinkText"))).click();
		return new MyHomePage(driver,prop);
		
	}
}
