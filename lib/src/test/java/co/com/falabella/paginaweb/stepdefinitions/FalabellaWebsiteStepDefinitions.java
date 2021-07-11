package co.com.falabella.paginaweb.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.falabella.paginaweb.tasks.AddBag;
import co.com.falabella.paginaweb.tasks.GoPay;
import co.com.falabella.paginaweb.tasks.GoTo;
import co.com.falabella.paginaweb.tasks.OpenTheBrowser;
import co.com.falabella.paginaweb.tasks.SelectProduct;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class FalabellaWebsiteStepDefinitions {
	
	@Managed(driver = "chrome" , options="--start-maximized --ignore-certificate-errors --disable-infobars --incognito ")
	private WebDriver hisBrowser; 
	private Actor elkin = Actor.named("Elkin");
	
	@Before
	public void setUp()
	{
		elkin.can(BrowseTheWeb.with(hisBrowser));
	}
	 
	@Given("^that elkin wants to choose a product$") // precondiciones
	public void thatElkinWantsToChooseAProduct() throws Exception {
		elkin.wasAbleTo(OpenTheBrowser.on());
		elkin.wasAbleTo( GoTo.theApp());
	    
	} 

	@When("^he add a product to the bag$") // condiciones
	public void heAddAProductToTheBag() throws Exception {
		
		elkin.attemptsTo(SelectProduct.on());
		elkin.attemptsTo(AddBag.on());
	    
	}

	@Then("^he should see the product in the bag$")// consecuencias
	public void heShouldSeeTheProductInTheBag() throws Exception {
		
		
		elkin.attemptsTo(GoPay.on());
		elkin.attemptsTo(PickUP.on());
		
		
	}


}
