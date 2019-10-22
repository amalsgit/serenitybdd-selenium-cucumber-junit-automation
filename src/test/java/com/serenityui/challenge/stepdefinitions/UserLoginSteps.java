package com.serenityui.challenge.stepdefinitions;

import com.serenityui.challenge.account.AccountPageQuestions;
import com.serenityui.challenge.navigationbar.NavigationBarQuestions;
import com.serenityui.challenge.navingation.NavigateActions;
import com.serenityui.challenge.signin.SignInPageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UserLoginSteps {

  @Steps
  NavigateActions navigateTo;

  @Steps
  SignInPageActions signIn;

  @Steps
  AccountPageQuestions accountPageQuestions;

  @Steps
  NavigationBarQuestions navigationBarQuestions;

  @Given("^(?:.*), (?:an existing|a new) customer navigates to application home page")
  public void user_navigates_to_application_home_page() {
    navigateTo.theHomePage();
  }

  @When("^(?:.*) logs into the application with his credentials$")
  public void user_logs_into_the_application_with_his_credentials() {
    navigateTo.theLoginPage();
    signIn.loginAsExistingUser();
  }

  @Then("^(.*) should be able to view his account page$")
  public void user_should_be_able_to_view_the_account_page(String user) {
    accountPageQuestions.verifyUserInAccountPage();
    navigationBarQuestions.verifyLoggedInUser(user);
  }

  @Then("view the sign out option")
  public void should_be_able_to_view_the_logout_option() {
    navigationBarQuestions.verifyLogoutLink();
  }
}
