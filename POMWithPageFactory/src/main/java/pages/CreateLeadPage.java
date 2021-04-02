package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	
	//public parameterized constructor
	public CreateLeadPage(ChromeDriver driver,Properties prop) {
		this.driver=driver;
		this.prop=prop;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="createLeadForm_companyName") WebElement elementCreateLeadPageCompanyName;
	public CreateLeadPage enterCompanyName(String Company) {
		elementCreateLeadPageCompanyName.sendKeys(Company);
		//driver.findElement(By.id(prop.getProperty("CreateLeadPage.CompanyName.Id"))).sendKeys(Company);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_firstName") WebElement elementCreateLeadPageFirstName;
	public CreateLeadPage enterFirstName(String FirstName) {
		elementCreateLeadPageFirstName.sendKeys(FirstName);
		//driver.findElement(By.id(prop.getProperty("CreateLeadPage.FirstName.Id"))).sendKeys(FirstName);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_lastName") WebElement elementCreateLeadPageLastName;
	public CreateLeadPage enterLastName(String LastName) {
		elementCreateLeadPageLastName.sendKeys(LastName);
		//driver.findElement(By.id(prop.getProperty("CreateLeadPage.LastName.Id"))).sendKeys(LastName);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail") WebElement elementCreateLeadPageEmailID;
	public CreateLeadPage enterEmailId(String emailId) {
		elementCreateLeadPageEmailID.sendKeys(emailId);
		//driver.findElement(By.id(prop.getProperty("CreateLeadPage.EmailId.Id"))).sendKeys(emailId);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber") WebElement elementCreateLeadPagePhoneNumber;
	public CreateLeadPage enterPhoneNumber(String PhoneNumber) {
		elementCreateLeadPagePhoneNumber.sendKeys(PhoneNumber);
		//driver.findElement(By.id(prop.getProperty("CreateLeadPage.PhoneNumber.Id"))).sendKeys(PhoneNumber);
		return this;
	}
	@FindBy(how=How.CLASS_NAME,using="smallSubmit") WebElement elementCreateLeadPageCreateLeadButton;
	public ViewLeadPage clickCreateLeadButton() {
		elementCreateLeadPageCreateLeadButton.click();
		//driver.findElement(By.className(prop.getProperty("CreateLeadPage.CreateLeadButton.Class"))).click();
		return new ViewLeadPage(driver,prop);
	}
}
