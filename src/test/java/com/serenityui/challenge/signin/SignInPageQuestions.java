package com.serenityui.challenge.signin;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignInPageQuestions extends UIInteractionSteps {

  @Step
  public void verifyUserInSignInPage() {
    waitForCondition().until(
        ExpectedConditions.visibilityOfElementLocated(SignInPage.SIGN_IN_BUTTON)).isDisplayed();
  }
}
