package com.hellofresh.challenge.signin;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignInPageQuestions extends UIInteractionSteps {

  public void verifyUserInSignInPage() {
    waitForCondition().until(
        ExpectedConditions.visibilityOfElementLocated(SignInPage.SIGN_IN_BUTTON)).isDisplayed();
  }
}
