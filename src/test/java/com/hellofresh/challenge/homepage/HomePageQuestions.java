package com.hellofresh.challenge.homepage;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePageQuestions extends UIInteractionSteps {

  public void verifyUserInHomePage() {
    waitForCondition().until(ExpectedConditions.titleIs("My Store"));
  }
}
