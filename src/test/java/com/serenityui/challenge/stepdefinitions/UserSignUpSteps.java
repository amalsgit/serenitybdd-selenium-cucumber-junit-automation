package com.serenityui.challenge.stepdefinitions;

import static com.serenityui.challenge.utils.customerdata.CustomDataGenerator.customerDataDTO;

import com.serenityui.challenge.account.AccountPageActions;
import com.serenityui.challenge.account.AccountPageQuestions;
import com.serenityui.challenge.createaccount.CreateAccountPageActions;
import com.serenityui.challenge.createaccount.CreateAccountPageQuestions;
import com.serenityui.challenge.navigationbar.NavigationBarQuestions;
import com.serenityui.challenge.navingation.NavigateActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

public class UserSignUpSteps {

  @Steps
  NavigateActions navigateTo;

  @Steps
  AccountPageActions accountPageActions;

  @Steps
  CreateAccountPageQuestions createAccountPageQuestions;

  @Steps
  CreateAccountPageActions createAccountPageActions;

  @Steps
  AccountPageQuestions accountPageQuestions;

  @Steps
  NavigationBarQuestions navigationBarQuestions;

  @Given("Matt, a new customer navigates to application sign in page")
  public void customer_navigates_to_application_sign_in_page() {
    navigateTo.theSignInPage();
  }

  @When("Matt registers as a new user of the application")
  public void register_as_a_new_user_of_the_application() {
    accountPageActions.createAccount();
    createAccountPageQuestions.verifyUserInCreateAccountPage();
    createAccountPageActions.createAccount();
  }

  @Then("Matt should get logged into the application")
  public void user_should_get_logged_into_the_application() {
    accountPageQuestions.verifyUserInAccountPage();
    String userName = customerDataDTO.getFirstName() + " " + customerDataDTO.getLastName();
    navigationBarQuestions.verifyLoggedInUser(userName);
  }

  @Given("Customer data is available for new user")
  public void create_customer_data() {
    Serenity.recordReportData().withTitle("Generated customer Data")
        .andContents(customerDataDTO.toString());
  }
}
