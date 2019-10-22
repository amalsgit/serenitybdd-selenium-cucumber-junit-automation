package com.serenityui.challenge.navingation;

import com.serenityui.challenge.homepage.HomePage;
import com.serenityui.challenge.homepage.HomePageQuestions;
import com.serenityui.challenge.navigationbar.NavigationBarActions;
import com.serenityui.challenge.signin.SignInPage;
import com.serenityui.challenge.signin.SignInPageQuestions;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class NavigateActions extends UIInteractionSteps {


  HomePage homePage;
  SignInPage signInPage;

  @Steps
  HomePageQuestions homePageQuestions;

  @Steps
  SignInPageQuestions signInPageQuestions;

  @Steps
  NavigationBarActions navigationBarActions;

  @Step("Navigate to home page")
  public void theHomePage() {
    homePage.open();
    homePageQuestions.verifyUserInHomePage();
  }

  @Step("Navigate to Log in page")
  public void theLoginPage() {
    navigationBarActions.goToSignInPage();
    signInPageQuestions.verifyUserInSignInPage();
  }

  @Step("Navigate to sign in page")
  public void theSignInPage() {
    signInPage.open();
    signInPageQuestions.verifyUserInSignInPage();
  }
}
