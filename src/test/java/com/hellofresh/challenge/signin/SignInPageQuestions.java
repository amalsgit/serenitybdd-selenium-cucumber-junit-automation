package com.hellofresh.challenge.signin;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Steps;

public class SignInPageQuestions extends UIInteractionSteps {

  @Steps
  SignInPage signIn;

  public void verifyUserInSignInPage() {
    $(signIn.SIGN_IN_BUTTON).waitUntilVisible();
  }

}
