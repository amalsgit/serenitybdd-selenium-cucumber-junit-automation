package com.serenityui.challenge.homepage;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePageQuestions extends UIInteractionSteps {

  @Step
  public void verifyUserInHomePage() {
    waitForCondition().until(ExpectedConditions.titleIs("My Store"));
  }
}
