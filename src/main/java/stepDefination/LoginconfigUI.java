package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class LoginconfigUI {
	
	WebDriver driver;
	
	@Given("^User is already on the login page$")
	public void user_is_already_on_the_login_page()  {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","F:\\chweb\\chromedriver.exe");
		String url = "https://10.10.30.27/ProductUI/#/login"; 
	    driver = new ChromeDriver();
	    driver.get(url);
	    
	}

	@Given("^title of the config UI home page$")
	public void title_of_the_config_UI_home_page()  {
	    // Write code here that turns the phrase above into concrete actions
	    String title = "Cavisson NetDiagnostics Enterprise (work)";
	    System.out.println("Assert is started ....");
	    Assert.assertEquals(driver.getTitle(), title);
	    System.out.println("Assert cased is passed ....");
	}

	@Then("^user enters \"(.*?)\" and \"(.*?)\"$")
	public void user_enters_and(String arg1, String arg2)  {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("cavisson");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("@dmin");
		System.out.println("input fields is inserted .....");
	    
	}

	@Then("^click on login option$")
	public void user_is_on_home_page()  {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.xpath("//button[@id='login-button']")).click();
		System.out.println("user able to login ....");
	    
	}

	@Then("^user click on home page$")
	public void user_click_on_home_page() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.xpath("//*[@class='top-panel-nav-icon mat-icon fa fa-home']")).click();
//		WebElement element = driver.findElement (By.xpath ("/html/body/entry/app-root/app-cav-nav-bar/md-toolbar/div/md-toolbar-row/nav/div/a[1]/md-icon"));
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript ("arguments[0].click();" , element);
	}

	@Then("^Close  the browser$")
	public void close_the_browser() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
	   Thread.sleep(200);
	    driver.quit(); // closed the browser
	    System.out.println("Close the browser successfully .....");
	}

}
