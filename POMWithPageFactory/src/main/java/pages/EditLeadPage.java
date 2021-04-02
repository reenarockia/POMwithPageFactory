package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods{
	//public parameterized constructor
		public EditLeadPage(ChromeDriver driver,Properties prop) {
				this.driver=driver;
				this.prop=prop;
				PageFactory.initElements(driver, this);
		}
		@FindBy(how=How.ID,using="updateLeadForm_companyName") WebElement elementEditLeadPageCompanyName;
		public EditLeadPage clearCompanyName() {
			elementEditLeadPageCompanyName.clear();
			//driver.findElement(By.id(prop.getProperty("EditLeadPage.CompanyName.Id"))).clear();
			return this;
		}
		
		public EditLeadPage enterNewCompanyName(String newCompanyName) {
			elementEditLeadPageCompanyName.sendKeys(newCompanyName);
			//driver.findElement(By.id(prop.getProperty("EditLeadPage.CompanyName.Id"))).sendKeys(newCompanyName);
			return this;
		}
		@FindBy(how=How.XPATH ,using="//input[@value='Update']") WebElement elementEditLeadPageUpdateButton;
		public ViewLeadPage clickUpdateButton() throws InterruptedException {
			elementEditLeadPageUpdateButton.click();
			//driver.findElement(By.xpath(prop.getProperty("EditLeadPage.UpdateButton.Xpath"))).click();
			Thread.sleep(3000);
			return new ViewLeadPage(driver,prop);
		}
		
}
