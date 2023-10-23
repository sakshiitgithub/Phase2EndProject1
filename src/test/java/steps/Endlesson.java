package steps;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Endlesson {
	
	WebDriver driver;
	
	@Given("I am on Amazon HomePage")
	public void i_am_on_amazon_home_page() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1500);
	    
	}

	@Then("I hover on Signin Accounts and List")
	public void i_hover_on_signin_accounts_and_list() throws InterruptedException {
		 WebElement e1 = driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));
			Actions a = new Actions(driver);
			a.moveToElement(e1).perform();
			Thread.sleep(1500);
			driver.findElement(By.linkText("Sign in")).click();
	}

	@Then("I enter email id like {string} on the page")
	public void i_enter_email_id_like_on_the_page(String EmailId) {
		driver.findElement(By.id("ap_email")).sendKeys("agrawal.sakshi1102000@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}


	@Then("I closed the browser")
	public void i_closed_the_browser() {
	    driver.close();
	}

	@Then("I enter input on the search bar")
	public void i_enter_input_on_the_search_bar() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");
	}

	@Then("I submit the searched item")
	public void i_submit_the_searched_item() throws InterruptedException {
        driver.findElement(By.id("twotabsearchtextbox")).submit();
		Thread.sleep(1500);
	}

	@Then("I choose the item from the wishlist")
	public void i_choose_the_item_from_the_wishlist() throws InterruptedException {
        driver.findElement(By.xpath("(//div[@class='a-section'])[2]/descendant::span[11]")).click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
		Thread.sleep(1500);
	}

	@Then("I click on wishlist button")
	public void i_click_on_wishlist_button() {
		driver.findElement(By.id("wishlistButtonStack")).click();
	}

	@Then("I click on the link Mobiles")
	public void i_click_on_the_link_mobiles() {
		driver.findElement(By.linkText("Mobiles")).click();
	}

	@Then("I move the mouse to the element")
	public void i_move_the_mouse_to_the_element() throws InterruptedException {
        WebElement mobile = driver.findElement(By.xpath("//*[@id='nav-subnav']/descendant::span[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(mobile).build().perform();
		Thread.sleep(1500);
	}

	@Then("I click on the mobile brand Apple")
	public void i_click_on_the_mobile_brand_apple() {
		driver.findElement(By.linkText("Apple")).click();
	}

	@Then("I click on the Apple phone link")
	public void i_click_on_the_apple_phone_link() {
		driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[6]/descendant::span[9]")).click();
	}

	@Then("I switch to the new tab window")
	public void i_switch_to_the_new_tab_window() throws InterruptedException {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(1500);
	}

	@Then("I click on the addtocart button")
	public void i_click_on_the_addtocart_button() {
		driver.findElement(By.id("add-to-cart-button")).click();
	}

}
