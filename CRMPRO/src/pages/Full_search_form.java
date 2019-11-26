package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.Data;
import framework.Event_Methods;

public class Full_search_form {
	@FindBy(name="mainpanel") WebElement frame;
	@FindBy(xpath = "//a[text()='Companies']") WebElement Companies;
	@FindBy(xpath = "//a[text()='Full Search Form']") WebElement FullsearchForm;
	@FindBy(id= "cs_name") WebElement Company;
	@FindBy(name="cs_industry") WebElement Industry;
	@FindBy(id="cs_annual_revenue") WebElement AnnualRevenue;
	@FindBy(id="cs_phone") WebElement Phone;
	@FindBy(id="cs_num_of_employees") WebElement Employees;

	@FindBy(name="cs_status") WebElement Status;
	@FindBy(xpath="//select[@name='cs_status']/option") List<WebElement> status_list;
	@FindBy(name="cs_category")WebElement Category;
	@FindBy(xpath ="//select[@name='cs_category']/option") List<WebElement> category_list;
	@FindBy(name="cs_priority") WebElement Priority;
	@FindBy(xpath ="//select[@name='cs_priority']/option") List<WebElement> priority_list;
	@FindBy(name="cs_source") WebElement Source;
	@FindBy(xpath="//select[@name='cs_source']/option") List<WebElement> source_list;
	@FindBy(name="cs_symbol") WebElement Symbol;
	
	@FindBy(id="cs_fax") WebElement Fax;
    @FindBy(id="cs_website") WebElement Website;
    @FindBy(id="cs_email") WebElement Email;
    
    public Full_search_form(){
    	 PageFactory.initElements(Data.driver, this);
    	
    }
    public void search_form() {
    	Event_Methods.switchtoframe(frame);
    	Event_Methods.clickbutton(Companies);
    	Event_Methods.clickbutton(FullsearchForm);
    	Event_Methods.Enter_value(Company,"Infosys");
    	Event_Methods.Enter_value(Industry,"abc");
    	Event_Methods.Enter_value(AnnualRevenue, "xyz");
    	Event_Methods.Enter_value(Phone, "123456");
    	Event_Methods.Enter_value(Employees, "15");
    	Event_Methods.Enter_value(Fax, "spoo");
        Event_Methods.clickbutton(Status); 
    	Event_Methods.selectvalueinListBox(status_list, "new");
    	Event_Methods.clickbutton(Category);
        Event_Methods.selectvalueinListBox(category_list, "Prospect");
        Event_Methods.clickbutton(Priority);
        Event_Methods.selectvalueinListBox(priority_list, "Low");
        
        Event_Methods.selectvalueinListBox(source_list, "Customer");
        Event_Methods.Enter_value(Website, "chrome");
        Event_Methods.Enter_value(Email, "spoorthijsw@gmail.com");
        
        
        
    	
    }
     
   
    
    
    
    
	
	
	
	

}
