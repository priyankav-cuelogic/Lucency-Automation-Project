package managers;

import org.openqa.selenium.WebDriver;

import pageobject.CallerProfilePage;
import pageobject.CommonPageElements;
import pageobject.HomePage;
import pageobject.LoginPage;


public class PageObjectManager {
	
	private HomePage homepage;
	private LoginPage loginpage;
	private CallerProfilePage callerprofile;
	private WebDriver driver;

	private CommonPageElements commonPageElement;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public CommonPageElements getCommonPageElements() {
		return (commonPageElement == null) ? commonPageElement =  new CommonPageElements(driver) : commonPageElement;
	}

	public HomePage getHomePage() {
		return (homepage == null) ? homepage = new HomePage(driver) : homepage;
	}
	
	public LoginPage getLogingPage() {
		return (loginpage == null) ? loginpage = new LoginPage(driver) : loginpage;		
	}
	
	public CallerProfilePage getCallerProfilePage()
	{
		return(callerprofile == null) ? callerprofile = new CallerProfilePage(driver) : callerprofile;
	}
	

}
