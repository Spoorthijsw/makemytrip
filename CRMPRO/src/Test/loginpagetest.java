package Test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import framework.Common_Methods;
import framework.Data;
import framework.Logs;
import framework.Utility_Files;
import framework.configMethods;
import pages.login_page;

public class loginpagetest extends configMethods{
	login_page loginpage;
	
	//@Parameters({"browser","url"})
	@Test(priority = 1)
	public void launch_Browser() {
		Data.logger.info("Application is launching");
		Common_Methods.launchApplication("chrome","https://www.crmpro.com/");
		loginpage= new login_page();
		Data.logger.info("Browser is launched");
	}
	@Test(priority = 3)
	public void validateloginpageTitleTest() {
		String title= loginpage.validateloginpageTitle();
		System.out.println(title);
		Assert.assertEquals(title,"CRMP - CRM software for customer relationship management, sales, and support.");
		Data.logger.info("loginpage Title is validated");
	}
	
	@Test(priority = 2)
	public void crmlogoTest() {
		boolean flag=loginpage.validatecrmimage();
		Assert.assertTrue(flag);
	   Data.logger.info("CRMLOGO test is validated");
	}
	@Test(priority = 4)
	public void loginTest() {
		loginpage.login("sudhananda123", "Test@1234");
		Data.logger.info("login successfull ");
	}
	
	

}
