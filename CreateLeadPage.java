package stepDef;

import org.openqa.selenium.By;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadPage extends ProjectSpecificMethod{

	@Given("Type the username as {string}")
	public void username(String username)
	{
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	}
 
	@And("Type the password as {string}")
	public void password(String password)
	{
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}

	@When("Click on the Login button")
	public void clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Verify the home page is displayed")
	public void titleVerify()
	{
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		if(text.contains("Welcome")) {
			System.out.println("Home page is displayed");
		}else {
			System.err.println("Home page is not displayed");
		}
	}

	@Given("Click CRMSFA Link")
	public void clickCrmSfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@And("Click Leads Tab")
	public void clickLeadsTab() {
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@And("Click Create Leads Link")
	public void clickClickLeadsLink() {
		driver.findElement(By.linkText("Create Lead")).click();
		
	}
	
	@When("Type the company name as (.*)$")
	public void typeCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		
	}

	@And("Type the first name as (.*)$")
	public void typeFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		
	}

	@And("Type the last name as (.*)$")
	public void typeLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}

	@And("Click Create Leads Button")
	public void clickCreateLeadsButton() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then("Verify the View Leads Page")
	public void verifyViewLeads() {
		String title = driver.getTitle();
		if(title.contains("View Leads")) {
			System.out.println("Got It !!");
		}
	}
	
}