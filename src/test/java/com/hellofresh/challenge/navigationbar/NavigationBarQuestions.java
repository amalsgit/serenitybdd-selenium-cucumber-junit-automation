package com.hellofresh.challenge.navigationbar;

import static org.assertj.core.api.Assertions.assertThat;

import net.serenitybdd.core.steps.UIInteractionSteps;

public class NavigationBarQuestions extends UIInteractionSteps {

  public String getCurrentUserName() {
    return $(NavigationBarPage.ACCOUNT_USER_NAME).getText();
  }

  public void verifyLogoutLink() {
    $(NavigationBarPage.LOGOUT_LINK).isDisplayed();
  }

  public void verifyLoggedInUser(String userName) {
    assertThat(getCurrentUserName().toLowerCase().contains(userName.toLowerCase())).isTrue();
  }
}
