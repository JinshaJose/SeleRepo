package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtilities;

public class LoginTest extends Base {
	@Test(groups= {"regression"},retryAnalyzer=retry.Retry.class)
	public void verifyTheUserIsAbleTologinUsingValidCredentials() throws Exception
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		//String username = "admin";
		//String password = "admin";
		String username = ExcelUtilities.readStringData(1, 0, "LoginPage");
		String password = ExcelUtilities.readStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickSignIn();
		boolean isDasboardLoaded = loginpage.isHomepageLoaded();
		Assert.assertTrue(isDasboardLoaded);
	}
	@Test
	public void verifyTheUserIsAbleTologinUsingInvalidUsernameAndValidPassword() throws Exception
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		//String username = "hello";
		//String password = "admin";
		String username = ExcelUtilities.readStringData(2, 0, "LoginPage");
		String password = ExcelUtilities.readStringData(2, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickSignIn();
		boolean alertmessage = loginpage.isAlertDisplayed();
		Assert.assertTrue(alertmessage);
	}
	@Test
	public void verifyTheUserIsAbleTologinUsingValidUsernameAndInvalidPassword() throws Exception
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		//String username = "admin";
		//String password = "hello";
		String username = ExcelUtilities.readStringData(3, 0, "LoginPage");
		String password = ExcelUtilities.readStringData(3, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickSignIn();
		boolean alertmessage = loginpage.isAlertDisplayed();
		Assert.assertTrue(alertmessage);
	}
	@Test
	public void verifyTheUserIsAbleTologinUsingInvalidUsernameAndInvalidPassword() throws Exception
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		//String username = "hello";
		//String password = "hello";
		String username = ExcelUtilities.readStringData(4, 0, "LoginPage");
		String password = ExcelUtilities.readStringData(4, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickSignIn();
		boolean alertmessage = loginpage.isAlertDisplayed();
		Assert.assertTrue(alertmessage);
	}
	
	
	

}
