package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	
	WebDriver driver;
	String baseUrl = "https://10.10.30.27";
	
	@Given("^Open chrome and start application$")
	public void open_chrome_and_start_application() {
		
		System.setProperty("webdriver.chrome.driver","F:\\chweb\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
		
	}

	@When("^I enter valid \"(.*?)\" and valid \"(.*?)\"$")
	public void i_enter_valid_and_valid(String arg1, String arg2) {
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text'][@placeholder='User Name']")).sendKeys("cavisson");
		driver.findElement(By.xpath("//input[@type='password'][@placeholder='Password']")).sendKeys("@dmin");
	    
	}

	@Then("^User should able login successfully$")
	public void user_should_able_login_successfully() throws Throwable {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	//	driver.findElement(By.xpath("span[@class='status']")).click();
		
	    Thread.sleep(2000);
	   // driver.close();
		
		
	}
	
	@When("^Click on Home icon$")
	public void click_on_Home_icon() throws Throwable {
		driver.findElement(By.xpath("//md-icon[@class='top-panel-nav-icon mat-icon fa fa-home']")).click();
	//	driver.findElement(By.xpath("/html/body/entry/app-root/app-cav-nav-bar/md-toolbar/div/md-toolbar-row/nav/div/a[1]/md-icon")).click();
		Thread.sleep(2000);

	}
	
	@When("^open NDConfig UI$")
	public void open_NDConfig_UI() throws Throwable {
	   driver.findElement(By.xpath("//*[@class='icon produi-icon-nde-setting']")).click();
		
	  Thread.sleep(2000);
	}
	
	@When("^Click on import topologies option$")
	public void click_on_import_topologies_option() throws Throwable {
	 
		driver.findElement(By.xpath("//span[text()='Import Topologies']")).click();
	}
	
	@Then("^Select drop down option in topology$")
	
	public void select_drop_down_option_in_topology() {
	//   Select dropdown = new Select (driver.findElement(By.xpath("//label[text()='--Select--']"))).click();
		Select dropdown = new Select (driver.findElement(By.xpath("//label[text()='--Select--']")));
	   // Select an item by visible element
	   dropdown.selectByVisibleText("NDDRTopology");
	   
//	   List <WebElement> e = = dropdown.getOptions();
//	   int intcoune = e.size();
  // System.out.println(intcoune);
	   
	   //System.out.p
	
	}
	
	}
