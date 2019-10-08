package com.hellofresh.challenge.navigationbar;

import net.serenitybdd.core.steps.UIInteractionSteps;

public class NavigationBarQuestions extends UIInteractionSteps {

  NavigationBarPage navigationBarPage;

  public String getCurrentUserName() {
    return $(navigationBarPage.ACCOUNT_USER_NAME).getText();
  }

  public void verifyLogoutLink() {
    $(navigationBarPage.LOGOUT_LINK).isDisplayed();
  }
}
