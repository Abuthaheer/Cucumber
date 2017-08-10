package steps;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utility.Base;

import pages.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends Base {
	WebDriver driver;
	LoginPage loginPage;

	@Given("^User is on facebook Page$")
	public void user_is_on_Home_Page() {
		driver = getDriver();

	}

	@When("^User enters credentials and clicks the button$")
	public void user_enters_credentials_and_clicks_the_button(DataTable data) {
		loginPage = new LoginPage();
		String s = RandomStringUtils.randomNumeric(5);
		List<Map<String, String>> dataMap = data.asMaps(String.class,
				String.class);
		// driver.findElement(By.id("email")).sendKeys(
		// dataMap.get(0).get("userName") + s);
		// driver.findElement(By.id("pass")).sendKeys(
		// dataMap.get(0).get("Password") + s);
		// driver.findElement(By.id("loginbutton")).click();
		setText(loginPage.getTxtUserName(), dataMap.get(0).get("userName") + s);
		setText(loginPage.getTxtPassword(), dataMap.get(0).get("Password") + s);
		clickBtn(loginPage.getBtnLogin());
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() {

		driver.quit();

	}

}
