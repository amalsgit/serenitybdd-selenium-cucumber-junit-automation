package com.hellofresh.challenge.navingation;

import com.hellofresh.challenge.homepage.HomePage;
import com.hellofresh.challenge.homepage.HomePageActions;
import com.hellofresh.challenge.homepage.HomePageQuestions;
import com.hellofresh.challenge.navigationbar.NavigationBarActions;
import com.hellofresh.challenge.signin.SignInPage;
import com.hellofresh.challenge.signin.SignInPageActions;
import com.hellofresh.challenge.signin.SignInPageQuestions;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class NavigateActions extends UIInteractionSteps{


  HomePage homePage;

  @Steps
  HomePageActions homePageActions;

  @Steps
  HomePageQuestions homePageQuestions;

  @Steps
  SignInPageActions signInPageActons;


  SignInPage signInPage;

  @Steps
  SignInPageQuestions signInPageQuestions;

  @Steps
  NavigationBarActions navigationBarActions;

  @Step
  public void theHomePage() {
    homePage.open();
    homePageQuestions.verifyUserInHomePage();
  }

  @Step
  public void theLoginPage() {
    navigationBarActions.goToSignInPage();
    signInPageQuestions.verifyUserInSignInPage();
  }

  @Step
  public void theSignInPage() {
    signInPage.open();
    signInPageQuestions.verifyUserInSignInPage();
  }
}
