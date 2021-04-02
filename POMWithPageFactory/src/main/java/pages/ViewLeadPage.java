package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {
	
	//public parameterized constructor
	public ViewLeadPage(ChromeDriver driver,Properties prop) {
		this.driver=driver;
		this.prop=prop;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="viewLead_firstName_sp") WebElement elementViewLeadPageFirstName;
	public ViewLeadPage verifyFirstName(String FirstName) {
		
		//if(driver.findElement(By.id(prop.getProperty("ViewLeadPage.FirstName.Id"))).getText().equalsIgnoreCase(FirstName)) {
		if(elementViewLeadPageFirstName.getText().equalsIgnoreCase(FirstName)) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}
		
		return this;
	}
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp") WebElement elementViewLeadPageCompanyName;
	public ViewLeadPage verifyCompanyName(String companyName) {
		//if(driver.findElement(By.id(prop.getProperty("ViewLeadPage.CompanyName.Id"))).getText().contains(companyName)) {
		if(elementViewLeadPageCompanyName.getText().contains(companyName)) {
			System.out.println("Lead's company name is changed to"+ companyName+" - Test Pass");
		}else {
			System.out.println("Lead's company name is not changed to "+ companyName+" - Test Fail");
		}
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Edit") WebElement elementViewLeadPageEditButton;
	public EditLeadPage clickEditButton() {
		elementViewLeadPageEditButton.click();
		//driver.findElement(By.linkText(prop.getProperty("ViewLeadPage.EditButton.LinkText"))).click();
		return new EditLeadPage(driver,prop);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead") WebElement elementViewLeadPageDuplicateLeadButton;
	public DuplicateLeadPage clickDuplicateLeadButton() {
		elementViewLeadPageDuplicateLeadButton.click();
		//driver.findElement(By.linkText(prop.getProperty("ViewLeadPage.DuplicateLeadButton.LinkText"))).click();
		return new DuplicateLeadPage(driver,prop);
	}
	
	//Doubt to be clarified . check with Bowya
	public ViewLeadPage storeOriginalLeadId() {
		originalLeadIdFromViewLeadPage=elementViewLeadPageCompanyName.getText().replaceAll("\\D", "");
		return this;
	}
	@FindBy(how=How.CLASS_NAME,using="subMenuButtonDangerous") WebElement elementViewLeadPageDeleteButton;
	public MyLeadsPage clickDeleteButton() throws InterruptedException {
		elementViewLeadPageDeleteButton.click();
		Thread.sleep(3000);
		//driver.findElement(By.className("subMenuButtonDangerous")).click();
		return new MyLeadsPage(driver, prop);
	}
}
