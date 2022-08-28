package stepDef;

import org.openqa.selenium.By;

import io.cucumber.java.en.*;

public class EditLead extends ProjectSpecificMethod {

	@And("Click Find Leads Link")
	public void click_find_leads_link() {
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
	}
	
	@Given("Type the First name as (.*)$")
	public void type_the_first_name_as(String firstName) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(firstName);
	}
	
	@And("Click the Find Leads button")
	public void click_the_find_leads_button() {	
		driver.findElement(By.xpath("//em/button[text()='Find Leads']")).click();
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Then("Click the First Matching Result")
	public void click_the_first_matching_result() {
		driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a")).click();
	}
	
	@And("Click the Edit button")
	public void click_the_edit_button() {
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
	}
	
	@Then("Change the Company name as (.*)$")
	public void change_companyName(String companyName) {
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys(companyName);
	}
	
	@And("Click Upadte Button")
	public void click_upadte_button() {
		driver.findElement(By.xpath("//input[@Value='Update']")).click();					}
	
	@Then("Verify the View Leads Page as companyName")
	public void verifyViewLeads(String companyName) {
		String company = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(company.contains(companyName)){
			System.out.println("Got It !!");
}}}
