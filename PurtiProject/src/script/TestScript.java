package script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LoginPage;

@Listeners(generic.Listeners.class)
public class TestScript extends BaseTest
{
	@Test
	public void validLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		LoginPage p = new LoginPage(d);
		p.username().sendKeys(Excel.readData("Sheet1", 1, 1));
		Thread.sleep(1000);
		p.password().sendKeys(Excel.readData("Sheet1", 2, 1));
		Thread.sleep(1000);
		p.login().click();
	}
	
	@Test
	public void invalidLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		LoginPage p = new LoginPage(d);
		p.username().sendKeys(Excel.readData("Sheet1", 1, 1));
		Thread.sleep(1000);
		p.password().sendKeys(Excel.readData("Sheet1", 2, 1));
		Assert.fail();
		Thread.sleep(1000);
		p.login().click();
	}
}
