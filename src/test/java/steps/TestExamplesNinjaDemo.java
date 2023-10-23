package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestExamplesNinjaDemo {
	
	WebDriver driver;
	
	@Given("I am on tutorialsNinja HomePage")
	public void i_am_on_tutorials_ninja_home_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
	    
	}
	
	@Then("I click on my account link")
	public void i_click_on_my_account_link() {
	   driver.findElement(By.xpath("//span[text()='My Account']")).click();
	}

	@When("I click on login link")
	public void i_click_on_login_link() {
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	}

	@Then("I will be on login page and I capture the title of the page")
	public void i_will_be_on_login_page_and_i_capture_the_title_of_the_page() {
		System.out.println("Title of the page is : " + driver.getTitle());
	}

	@Then("I enter email id as {string} on the page")
 public void i_enter_email_id_as_seleniumdemo_gmail_com_on_the_page(String EmailID) {
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(EmailID);
	}

	@Then("i enter password as {string} on the page")
	public void i_enter_password_as_on_the_page(String Password) {
    driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(Password);
	}

	@Then("I click login button")
	public void i_click_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}


	@Then("I close browser")
	public void i_close_browser() {
	    driver.close();
	}
	
	@Then("I enter Input for the search box")
	public void i_enter_input_for_the_search_box() {
	  driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Mac");
	}
	@Then("I click on search button")
	public void i_click_on_search_button() {
		 driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
	}
	
	@Given("I click on Add to Cart button")
	public void i_click_on_add_to_cart_button() {
		 driver.findElement(By.linkText("Shopping Cart")).click();
	}
	@Given("I click on Checkout button")
	public void i_click_on_checkout_button() {
		driver.findElement(By.linkText("Checkout")).click();
	}

	

}
