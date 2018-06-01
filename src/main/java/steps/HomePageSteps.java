package steps;

import org.junit.Assert;

import com.objects.common.commonObjects;
import com.objects.homePage.homePageObjects;

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

	@When("^User enters \"(.*?)\",\"(.*?)\" and click the login  button$")
	public void user_enters_and_click_the_login_button(String arg1, String arg2) throws Throwable {

		homePage.enterUserName(arg1);
		homePage.enterPassWord(arg2);
		homePage.clickLogin();
	}

	@Then("^User should able to login successfully$")
	public void user_should_able_to_login_successfully() throws Throwable {
		common = new commonObjects();
		Assert.assertTrue(base.isElementVisible(common.getSignOff()));
	}

}
