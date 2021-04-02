package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	//public parameterized constructor
	public MyLeadsPage(ChromeDriver driver,Properties prop) {
		this.driver=driver;
		this.prop=prop;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.LINK_TEXT,using="Create Lead") WebElement elementMyLeadsPageCreateLeadLink;
	public CreateLeadPage clickCreateLeadLink() {
		elementMyLeadsPageCreateLeadLink.click();
		//driver.findElement(By.linkText(prop.getProperty("MyLeadsPage.CreateLeadLink.LinkText"))).click();
		return new CreateLeadPage(driver,prop);
	}
	@FindBy(how=How.LINK_TEXT,using="Find Leads") WebElement elementMyLeadsPageFindLeadsLink;
	public FindLeadsPage clickFindLeadsLink() throws InterruptedException {
		elementMyLeadsPageFindLeadsLink.click();
		//driver.findElement(By.linkText(prop.getProperty("MyLeadsPage.FindLeadsLink.LinkText"))).click();
		Thread.sleep(3000);
		return new FindLeadsPage(driver,prop);
	}

}
