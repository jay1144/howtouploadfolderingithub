package generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils 
{
	public static void selectByText(WebElement element , String text)
	{
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	
	public static void selectByIndex(WebElement element , int n)
	{
		Select s = new Select(element);
		s.selectByIndex(n);
	}
	
	public static void mousehover(WebElement element)
	{
		Actions a = new Actions(BaseTest.d);
		a.moveToElement(element).perform();
	}
	
	public static void scroll(int x , int y)
	{
		JavascriptExecutor j = (JavascriptExecutor) BaseTest.d;
		j.executeScript("window.scrollBy("+x+","+y+")", "");
	}
}
