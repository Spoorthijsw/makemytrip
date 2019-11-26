package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.Data;
import framework.Event_Methods;

public class login_page {

@FindBy(xpath = "//img[@class='img-responsive']")
WebElement logo;

@FindBy(name="username")
WebElement userName;

@FindBy(name="password")
WebElement passWord;

@FindBy(xpath = "//input[@class='btn btn-small']")
WebElement loginbtn;

  public login_page() {
	  PageFactory.initElements(Data.driver, this);
  }
  
  public String validateloginpageTitle() {
	  return Data.driver.getTitle();
  }
  public boolean validatecrmimage() {
	return  logo.isDisplayed();
  }
  
  public void login(String un,String pw) {
	  Event_Methods.Enter_value(userName, un);
	  Event_Methods.Enter_value(passWord, pw);
	  Event_Methods.clickbutton(loginbtn);
	  
  }
  
		
             

	}


