package defenetion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class sd {
	public static String url="https://demo.guru99.com/test/newtours/";
	WebDriver driver;
	
	@Given("You should be in home page")
	public void you_should_be_in_home_page() throws InterruptedException {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.get(url);
	   driver.manage().window().maximize();
	   Thread.sleep(5000);
	}

	@And("pass the username")
	public void pass_the_username() throws InterruptedException {
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("user");
		Thread.sleep(5000);
	}

	@And("pass the password")
	public void pass_the_password() throws InterruptedException {
		driver.findElement(By.name("password")).sendKeys("user");
		Thread.sleep(5000);
	}

	@And("hit the submit button")
	public void hit_the_submit_button() throws InterruptedException {
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
	}

	@And("click on register")
	public void click_on_register() throws InterruptedException {
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(5000);
	}

	@And("enter first name")
	public void enter_first_name() throws InterruptedException {
		driver.findElement(By.name("firstName")).sendKeys("RAM");
		Thread.sleep(5000);
	}

	@And("enter last name")
	public void enter_last_name() throws InterruptedException {
		driver.findElement(By.name("lastName")).sendKeys("RAJU");
		Thread.sleep(5000);
	}

	@And("enter phone number")
	public void enter_phone_number() throws InterruptedException {
		driver.findElement(By.name("phone")).sendKeys("9876543210");
		Thread.sleep(5000);
	}

	@And("enter email")
	public void enter_email() throws InterruptedException {
		driver.findElement(By.name("userName")).sendKeys("raju@gmail.com");
		Thread.sleep(5000);
	}

	@And("enter Address")
	public void enter_address() throws InterruptedException {
		driver.findElement(By.name("address1")).sendKeys("2nd street 3rd main");
		Thread.sleep(5000);
	}

	@And("enter city")
	public void enter_city() throws InterruptedException {
		driver.findElement(By.name("city")).sendKeys("banglore");
		Thread.sleep(5000);
	}

	@And("enter state")
	public void enter_state() throws InterruptedException {
		driver.findElement(By.name("state")).sendKeys("KARNATAKA");
		Thread.sleep(5000);
	}

	@And("enter postal code")
	public void enter_postal_code() throws InterruptedException {
		driver.findElement(By.name("postalCode")).sendKeys("562101");
		Thread.sleep(5000);
	}

	@And("select country")
	public void select_country() throws InterruptedException {
		WebElement cont=driver.findElement(By.name("country"));
		Select opt=new Select(cont);
    	opt.selectByIndex(6);
    	Thread.sleep(5000);
	}

	@And("enter username")
	public void enter_username() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("ram@gmail.com");
		Thread.sleep(5000);
	}

	@And("enter password")
	public void enter_password() throws InterruptedException {
		driver.findElement(By.name("password")).sendKeys("12345");
		Thread.sleep(5000);
	}

	@And("enter confrim password")
	public void enter_confrim_password() throws InterruptedException {
		driver.findElement(By.name("confirmPassword")).sendKeys("12345");
		Thread.sleep(5000);
	}

	@Then("hit submit")
	public void hit_submit() throws InterruptedException {
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
	}

}
