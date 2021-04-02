package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;

public class DuplicateLeadPage extends ProjectSpecificMethods{
	
	public DuplicateLeadPage(ChromeDriver driver) {
		this.driver=driver;	
	}
	
	//public parameterized constructor
			public DuplicateLeadPage(ChromeDriver driver,Properties prop) {
					this.driver=driver;
					this.prop=prop;
					PageFactory.initElements(driver, this);
			}
			@FindBy(how=How.CLASS_NAME,using="smallSubmit") WebElement elementDuplicateLeadPageCreateLeadButton;
			public ViewLeadPage clickCreateLeadButton() {
				elementDuplicateLeadPageCreateLeadButton.click();
				//driver.findElement(By.className(prop.getProperty("DuplicateLeadPage.CreateLeadButton.Class"))).click();
				return new ViewLeadPage(driver, prop);
			}
}
