package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginSample extends Base {
	@Test
	public void login()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		String username = "admin";
		String password = "admin";
		WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
		uname.sendKeys(username);
		WebElement pswd = driver.findElement(By.xpath("//input[@name='password']"));
		pswd.sendKeys(password);
		WebElement signIn = driver.findElement(By.xpath("//button[text()='Sign In']"));
		signIn.click();
		WebElement dashboard = driver.findElement(By.xpath("//p[text()='Dashboard']"));
		boolean ishomepageloaded = dashboard.isDisplayed();
		Assert.assertTrue(ishomepageloaded);
		}
	//correct user,wrong pass-locate alert,isdisplayed
	//wrong user,corr pas
	//wron
	@Test
	public void invalidUserValidPass()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		String username = "hello";
		String password = "admin";
		WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
		uname.sendKeys(username);
		WebElement pswd = driver.findElement(By.xpath("//input[@name='password']"));
		pswd.sendKeys(password);
		WebElement signIn = driver.findElement(By.xpath("//button[text()='Sign In']"));
		signIn.click();
		WebElement alert = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean alertDisplay = alert.isDisplayed();
		Assert.assertTrue(alertDisplay);
	}
	@Test
	public void validUserInvalidPass()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		String username = "admin";
		String password = "hello";
		WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
		uname.sendKeys(username);
		WebElement pswd = driver.findElement(By.xpath("//input[@name='password']"));
		pswd.sendKeys(password);
		WebElement signIn = driver.findElement(By.xpath("//button[text()='Sign In']"));
		signIn.click();
		WebElement alert = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean alertDisplay = alert.isDisplayed();
		Assert.assertTrue(alertDisplay);
	}
	@Test
	public void invalidUserInvalidPass()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		String username = "hello";
		String password = "hello";
		WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
		uname.sendKeys(username);
		WebElement pswd = driver.findElement(By.xpath("//input[@name='password']"));
		pswd.sendKeys(password);
		WebElement signIn = driver.findElement(By.xpath("//button[text()='Sign In']"));
		signIn.click();
		WebElement alert = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean alertDisplay = alert.isDisplayed();
		Assert.assertTrue(alertDisplay);
	}
	

}
