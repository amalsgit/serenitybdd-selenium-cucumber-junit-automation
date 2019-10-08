package com.hellofresh.challenge.navigationbar;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class NavigationBarActions extends UIInteractionSteps {

  NavigationBarPage navigationBarPage;

  @Step
  public void goToSignInPage() {
    $(navigationBarPage.SIGN_IN_LINK).click();
  }
}
