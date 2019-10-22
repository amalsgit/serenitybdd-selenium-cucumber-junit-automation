package com.serenityui.challenge.account;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountPageQuestions extends UIInteractionSteps {

  @Step
  public void verifyUserInAccountPage() {
    String heading = waitForCondition().until(
        ExpectedConditions.visibilityOfElementLocated(AccountPage.ACCOUNT_PAGE_HEADING)).getText();

    SoftAssertions softly = new SoftAssertions();
    softly.assertThat(heading.equalsIgnoreCase("MY ACCOUNT")).isTrue();
    softly.assertThat($(AccountPage.ACCOUNT_INFO_TEXT).getText())
        .contains("Welcome to your account.");
    softly.assertThat(getDriver().getCurrentUrl()).contains("controller=my-account");
    softly.assertAll();
  }
}