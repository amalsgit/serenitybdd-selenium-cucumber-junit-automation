package com.hellofresh.challenge.stepdefinitions;

import com.hellofresh.challenge.account.AccountPageActions;
import com.hellofresh.challenge.createaccount.CreateAccountPageActions;
import com.hellofresh.challenge.createaccount.CreateAccountPageQuestions;
import com.hellofresh.challenge.navingation.NavigateActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UserSignUpSteps{

  @Steps
  NavigateActions navigateTo;

  @Steps
  AccountPageActions accountPageActions;

  @Steps
  CreateAccountPageQuestions createAccountPageQuestions;

  @Steps
  CreateAccountPageActions createAccountPageActions;

  UserLoginSteps userLoginSteps;

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

  }
}
