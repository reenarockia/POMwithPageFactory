package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{
	
	//public parameterized constructor
		public MyHomePage(ChromeDriver driver,Properties prop) {
			this.driver=driver;
			this.prop=prop;
			PageFactory.initElements(driver, this);
		}
		@FindBy(how=How.LINK_TEXT,using="Leads") WebElement elementMyHomePageLeadsLink;
		public MyLeadsPage clickLeadsLink() {
		elementMyHomePageLeadsLink.click();
		//driver.findElement(By.linkText(prop.getProperty("MyHomePage.LeadsLink.LinkText"))).click();
		return new MyLeadsPage(driver,prop);
		}

}
