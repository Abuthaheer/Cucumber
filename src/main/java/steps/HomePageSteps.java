package steps;

import java.util.List;

import org.junit.Assert;

import com.objects.common.commonObjects;
import com.objects.homePage.homePageObjects;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.BasePage;

public class HomePageSteps {

	homePageObjects homePage;
	commonObjects common;
	BasePage base;

	public HomePageSteps() {
		base = new BasePage();
	}

	@Given("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
		homePage = new homePageObjects();
	}

	@Then("^User should able to login successfully$")
	public void user_should_able_to_login_successfully() throws Throwable {
		common = new commonObjects();
		Assert.assertTrue(base.isElementVisible(common.getSignOff()));
	}

	@When("^User enters \"(.*?)\" and \"(.*?)\" and click the login  button$")
	public void user_enters_and_and_click_the_login_button(String arg1, String arg2) throws Throwable {
		homePage.enterUserName(arg1);
		homePage.enterPassWord(arg2);
		homePage.clickLogin();

	}

	@When("^User enters \"(.*?)\",\"(.*?)\" and click the login  button$")
	public void user_enters_and_click_the_login_button(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		homePage.enterUserName(arg1);
		homePage.enterPassWord(arg2);
		homePage.clickLogin();
	}

	@When("^User enters credentials and click login button$")
	public void user_enters_credentials_and_click_login_button(DataTable arg1) throws Throwable {
		List<List<String>> values = arg1.raw();
		homePage.enterUserName(values.get(0).get(0));
		homePage.enterPassWord(values.get(0).get(1));
		homePage.clickLogin();
	}
}
