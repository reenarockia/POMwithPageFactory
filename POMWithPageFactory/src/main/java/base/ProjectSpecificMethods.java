package base;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;


public class ProjectSpecificMethods {
	
	public ChromeDriver driver;
	public String fileName,sheetNumber;
	public Properties prop;
	public SoftAssert softAssert;
	public static String originalLeadIdFromViewLeadPage;
	
	@BeforeMethod
	public void stratTest() throws IOException {
		//Properties file set up
		FileInputStream fis = new FileInputStream("./src/main/resources/english.properties");
		prop=new Properties();
		prop.load(fis);
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		softAssert=new SoftAssert();
		
	}
	
	@AfterMethod
	public void endTest() {
		driver.quit();
	}
	
	 @DataProvider(name="Data")
	 public String[][] DataToPass() throws IOException {
		 ReadExcel obj1=new ReadExcel();
		 return obj1.readDataFromXL(fileName,sheetNumber);
		 
	 }

}
