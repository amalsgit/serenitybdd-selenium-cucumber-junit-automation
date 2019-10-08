package com.hellofresh.challenge.createaccount;

import java.time.Duration;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class CreateAccountPageQuestions extends UIInteractionSteps {

  CreateAccountPage createAccountPage;

  public void verifyUserInCreateAccountPage() {
  $(createAccountPage.ACC_CREATION_FORM).withTimeoutOf(Duration.ofSeconds(10)).waitUntilVisible();
  }
}
