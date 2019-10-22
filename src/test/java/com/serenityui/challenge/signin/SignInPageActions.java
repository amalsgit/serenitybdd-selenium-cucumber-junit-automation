package com.serenityui.challenge.signin;

import com.serenityui.challenge.utils.testdata.LoadTestData;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class SignInPageActions extends UIInteractionSteps {

  @Step
  public void loginAsExistingUser() {
    $(SignInPage.EMAIL_FIELD).sendKeys(LoadTestData.testData.getUserEmail());
    $(SignInPage.PASSWORD_FIELD).sendKeys(LoadTestData.testData.getUserPassword());
    $(SignInPage.SIGN_IN_BUTTON).click();
  }
}
