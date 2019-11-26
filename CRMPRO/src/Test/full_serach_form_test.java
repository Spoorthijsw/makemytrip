package Test;

import org.testng.annotations.Test;

import framework.Common_Methods;
import pages.Full_search_form;
import pages.login_page;

public class full_serach_form_test {
	
	login_page login;
	Full_search_form sf;
	
	@Test
	public void login() {
		Common_Methods.launchApplication("chrome","https://www.crmpro.com/" );
		login= new login_page();
		login.login("sudhananda123", "Test@1234 ");
	}
	@Test(priority = 1)
	public void navigatefullsearch() {
		sf= new Full_search_form();
		sf.search_form();
		
	}
	
	

}
