package seleniumPages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import common.Page_BasePage;

public class Page_homepage extends Page_BasePage {

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver();
	}

	public void openHepsiburadaURL() {
		driver.get("https://www.hepsiburada.com/uyelik/giris?ReturnUrl=%2f");
	}

	public void ifill_name(String fieldName, String fieldValue) {
		if (driver.findElements(By.id(fieldName)).size() == 1 ) {
			driver.findElement(By.id(fieldName)).sendKeys(fieldValue);
		}
		else driver.findElement(By.name(fieldName)).sendKeys(fieldValue);
	}
	public void ifill_password(String fieldName, String fieldValue) {
		if (driver.findElements(By.id(fieldName)).size() == 1 ) {
			driver.findElement(By.id(fieldName)).sendKeys(fieldValue);
		}
		else driver.findElement(By.name(fieldName)).sendKeys(fieldValue);
	}


	public void i_click_link(){
		driver.findElement(By.cssSelector(".btn-login-submit")).click();
	}

	public void i_click_search( ){
		driver.findElement(By.cssSelector(".input-product-search")).click();

		//driver.findElement(By.id("productSearch")).click();

	}

	public void isearch(String fieldName, String fieldValue){

		//driver.findElement(By.cssSelector(".input-product-search")).sendKeys("hasbi");

		if (driver.findElements(By.id(fieldName)).size() == 1 ) {
			driver.findElement(By.id(fieldName)).sendKeys(fieldValue);
		}
		else driver.findElement(By.name(fieldName)).sendKeys(fieldValue);

		driver.findElement(By.id("buttonProductSearch")).click();
	}
	
	public void i_add_book_to_basket( ){

		driver.findElement(By.cssSelector(".add-to-basket")).click();


	}
	public void i_go_to_basket(){
		driver.findElement(By.cssSelector(".icon-view-basket")).click();
	}

	public void i_finish_shoping(){
		driver.findElement(By.cssSelector(".btn-primary")).click();
	}
	
	public void i_continue_to_pay(){
		driver.findElement(By.cssSelector(".btn-primary")).click();
	}
	public void i_select_info(){
		driver.findElement(By.cssSelector(".shipping-product-container")).click();
	}
	
	public void i_select_havale(){
		driver.findElement(By.cssSelector(".accordion-title paymentType-2")).click();
	}
}