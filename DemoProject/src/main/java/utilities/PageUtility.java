package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void selectByIndexMethod(WebElement element,int index) {
		Select select =new Select(element);
		select.selectByIndex(index);
		
	}
	public void selectByVisibleTextMethod(WebElement element,String text) {
		Select select =new Select(element);
		select.selectByVisibleText(text);
		
	}
	public void selectByValueMethod(WebElement element,String value) {
		Select select =new Select(element);
		select.selectByValue(value);
		
	}

}
