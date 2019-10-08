package com.hellofresh.challenge.account;

import static org.assertj.core.api.Assertions.assertThat;

import com.hellofresh.challenge.navigationbar.NavigationBarPage;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Steps;

public class AccountQuestions extends UIInteractionSteps {

  AccountPage accountPage;

  @Steps
  NavigationBarPage navigationBarPage;

  public void verifyUserInAccountPage() {
    $(accountPage.ACCOUNT_INFO_TEXT).getText().contains("Welcome to your account.");
    String currentUrl = $(navigationBarPage.getDriver().getCurrentUrl()).toString();
    assertThat(currentUrl).contains("controller=my-account");
  }
}

