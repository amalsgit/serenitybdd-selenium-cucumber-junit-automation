package com.serenityui.challenge.createaccount;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateAccountPageQuestions extends UIInteractionSteps {

  @Step
  public void verifyUserInCreateAccountPage() {
    waitForCondition().until(
        ExpectedConditions.visibilityOfElementLocated(CreateAccountPage.ACC_CREATION_FORM)).isDisplayed();
  }
}
