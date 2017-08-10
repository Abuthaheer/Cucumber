package steps;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import utility.Base;
import utility.Employee;
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

	@When("^User enters \"([^\"]*)\",\"([^\"]*)\" and click the login  button$")
	public void user_enters_and_click_the_login_button(String userName,
			String Password) throws SQLException {
		loginPage = new LoginPage();
		List<Employee> emp = retriveValueFromDataBase();

		setText(loginPage.getTxtUserName(), emp.get(0).getName());
		setText(loginPage.getTxtPassword(), emp.get(0).getPassword());
		clickBtn(loginPage.getBtnLogin());

	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() {

		driver.quit();

	}

}
