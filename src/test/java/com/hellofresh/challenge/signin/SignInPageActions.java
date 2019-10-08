package com.hellofresh.challenge.signin;

import com.hellofresh.challenge.utils.LoadTestData;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class SignInPageActions extends UIInteractionSteps {

  @Steps
  SignInPage signIn;

  @Step
  public void loginAsExistingUser() {
    $(signIn.EMAIL_FIELD).sendKeys(LoadTestData.testData.getUserEmail());
    $(signIn.PASSWORD_FIELD).sendKeys(LoadTestData.testData.getUserPassword());
    $(signIn.SIGN_IN_BUTTON).click();
  }
}
