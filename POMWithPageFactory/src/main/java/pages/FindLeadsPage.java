package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FindLeadsPage extends ProjectSpecificMethods{
	//public parameterized constructor
		public FindLeadsPage(ChromeDriver driver,Properties prop) {
			this.driver=driver;
			this.prop=prop;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(how=How.NAME,using="id") WebElement elementFindLeadsPageLeadID;
		public FindLeadsPage searchByLeadId(String leadId) {
			elementFindLeadsPageLeadID.sendKeys(leadId);
			//driver.findElement(By.name(prop.getProperty("FindLeadsPage.LeadID.Name"))).sendKeys(leadId);
			return this;
		}
		
		@FindBy(how=How.XPATH,using="//span[text()='Find by']//following::input[@name='firstName']") WebElement elementFindLeadsPageFirstName;
		public FindLeadsPage searchByFirstName(String firstName){
			elementFindLeadsPageFirstName.sendKeys(firstName);
			//driver.findElement(By.xpath(prop.getProperty("FindLeadsPage.FirstName.Xpath"))).sendKeys(firstName);
			return this;
		}
		@FindBy(how=How.NAME,using="lastName") WebElement elementFindLeadsPageLastName;
		public FindLeadsPage searchByLastName(String lastName) {
			elementFindLeadsPageLastName.sendKeys(lastName);
			//driver.findElement(By.name(prop.getProperty("FindLeadsPage.LastName.Name"))).sendKeys(lastName);
			return this;
		}
		@FindBy(how=How.NAME,using="companyName") WebElement elementFindLeadsPageCompanyName;
		public FindLeadsPage searchByCompanyName(String companyName) throws InterruptedException {
			elementFindLeadsPageCompanyName.sendKeys(companyName);
			//driver.findElement(By.name(prop.getProperty("FindLeadsPage.CompanyName.Name"))).sendKeys(companyName);
			return this;
		}
		@FindBy(how=How.XPATH,using="//span[text()='Phone']") WebElement elementFindLeadsPagePhoneTab;
		@FindBy(how=How.XPATH,using="//span[text()='Find by']//following::input[@name='phoneNumber']") WebElement elementFindLeadsPagePhoneNumber;
		public FindLeadsPage searchByPhoneNumber(String phoneNumber) {
			elementFindLeadsPagePhoneTab.click();
			elementFindLeadsPagePhoneNumber.sendKeys(phoneNumber);
//			driver.findElement(By.xpath(prop.getProperty("FindLeadsPage.PhoneTab.Xpath"))).click();
//			driver.findElement(By.xpath(prop.getProperty("FindLeadsPage.PhoneNumber.Xpath"))).sendKeys(phoneNumber);
			return this;
		}
		@FindBy(how=How.XPATH,using="//span[text()='Email']") WebElement elementFindLeadsPageEmailTab;
		@FindBy(how=How.XPATH,using="//span[text()='Find by']//following::input[@name='emailAddress']") WebElement elementFindLeadsPageEmailId;
		public FindLeadsPage searchByEmailId(String emailId) {
			elementFindLeadsPageEmailTab.click();
			elementFindLeadsPageEmailId.sendKeys(emailId);
//			driver.findElement(By.xpath(prop.getProperty("FindLeadsPage.EmailTab.Xpath"))).click();
//			driver.findElement(By.xpath(prop.getProperty("FindLeadsPage.EmailId.Xpath"))).sendKeys(emailId);
			return this;
		}
		@FindBy(how=How.XPATH,using="//button[text()='Find Leads']") WebElement elementFindLeadsPageFindLeadsButton;
		public FindLeadsPage clickFindLeadsButton() throws InterruptedException {
			elementFindLeadsPageFindLeadsButton.click();
			//driver.findElement(By.xpath(prop.getProperty("FindLeadsPage.FindLeadsButton.Xpath"))).click();
			Thread.sleep(3000);
			return this;
		}
		@FindBy(how=How.XPATH,using="(//table[@class='x-grid3-row-table']//tr[1]/td[1]//a)[1]") WebElement elementFindLeadsPageFirstResultingLeadID;
		public ViewLeadPage clickFirstResultingLeadId() throws InterruptedException {
			driver.findElement(By.xpath("//div[text()='Lead ID']")).click();
			Thread.sleep(3000);
			elementFindLeadsPageFirstResultingLeadID.click();
			//driver.findElement(By.xpath(prop.getProperty("FindLeadsPage.FirstResultingLeadID.Xpath"))).click();
			Thread.sleep(3000);
			return new ViewLeadPage(driver,prop);
		}
		
		@FindBy(how=How.CLASS_NAME,using="x-paging-info") WebElement elementFindLeadsPageNoRecords;
		public FindLeadsPage verifyNoRecordsFoundMessageDisplay() {
			System.out.println("Text: "+elementFindLeadsPageNoRecords.getText());
			if(elementFindLeadsPageNoRecords.getText().equalsIgnoreCase("No records to display")) {
				System.out.println("successfully deleted");
			}else {
				System.out.println("Test Fail");
			}
			//softAssert.assertEquals(elementFindLeadsPageNoRecords.getText(),"No records to display");
			//softAssert.assertEquals(driver.findElement(By.className("x-paging-info")).getText(), "No records to display");
			
			return this;
		}

		
}
