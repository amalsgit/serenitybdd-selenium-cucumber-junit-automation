package com.serenityui.challenge.navigationbar;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class NavigationBarActions extends UIInteractionSteps {

  @Step
  public void goToSignInPage() {
    $(NavigationBarPage.SIGN_IN_LINK).click();
  }
}
