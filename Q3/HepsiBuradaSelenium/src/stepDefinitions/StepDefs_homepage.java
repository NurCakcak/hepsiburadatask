package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumPages.Page_homepage;

public class StepDefs_homepage {
	
	Page_homepage hepsiburadaHomepage = new Page_homepage();
	
	
	@Given("^I launch Chrome browser$")
	public void i_launch_Chrome_browser() throws Exception {
		hepsiburadaHomepage.launchBrowser(); 
	}

	@When("^I open hepsiburada Homepage$")
	public void i_open_hepsiburada_Homepage() throws Exception {
		hepsiburadaHomepage.openHepsiburadaURL();
	}
	
	@When("^I wait for \"(\\d*)\" seconds")
    public void wait_for(int seconds) throws Throwable {
		//WebElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));
        Thread.sleep(seconds * 1000);
    }
    
	@Then("^I fill name \"([^\"]*)\" as \"([^\"]*)\"$") 
	public void ifill_name(String arg1, String arg2) throws Exception  {
		hepsiburadaHomepage.ifill_name(arg1, arg2);
	}
	@Then("^I fill password \"([^\"]*)\" as \"([^\"]*)\"$") 
	public void ifill_password(String arg1, String arg2) throws Exception  {
		hepsiburadaHomepage.ifill_password(arg1, arg2);
	}
	
	@Then("^I click Log in$") 
	public void i_click_link() throws Exception   {
		hepsiburadaHomepage.i_click_link();
	}
	
	@Then("^I click search$") 
	public void i_click_search() throws Exception   {
		hepsiburadaHomepage.i_click_search();
	}
	
	@Then("^I search book \"([^\"]*)\" as \"([^\"]*)\"$") 
	public void isearch(String arg1, String arg2) throws Exception  {
		hepsiburadaHomepage.isearch(arg1, arg2);
	}
   
	@Then("^I go to basket$")
	public void i_go_to_basket() throws Exception   {
		hepsiburadaHomepage.i_go_to_basket();
	}
	
	@Then("^I finish shoping$")
	public void i_finish_shoping() throws Exception   {
		hepsiburadaHomepage.i_finish_shoping();
	}
	
	@Then("^I continue to pay$")
	public void i_continue_to_pay() throws Exception   {
		hepsiburadaHomepage.i_continue_to_pay();
	}
	
	@Then("^I select info$")
	public void i_select_info() throws Exception   {
		hepsiburadaHomepage.i_select_info();
	}
    
	@Then("^I select havale$")
	public void i_select_havale() throws Exception   {
		hepsiburadaHomepage.i_select_havale();
	}
	
	

}
