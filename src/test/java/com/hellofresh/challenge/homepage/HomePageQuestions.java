package com.hellofresh.challenge.homepage;

import static org.assertj.core.api.Assertions.assertThat;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Steps;

public class HomePageQuestions extends UIInteractionSteps {

  HomePage homePage;

  public void verifyUserInHomePage() {
    assertThat(homePage.getTitle()).isEqualToIgnoringCase("My Store");
  }
}
