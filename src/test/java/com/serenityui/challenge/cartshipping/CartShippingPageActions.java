package com.serenityui.challenge.cartshipping;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartShippingPageActions extends UIInteractionSteps {

  @Step("Confirm terms of service")
  public void confirmTerms() {
    waitForCondition().until(
        ExpectedConditions.visibilityOfElementLocated(CartShippingPage.TERMS_CHECKBOX))
        .click();
  }

  @Step("Proceed to checkout from shipping page")
  public void proceedToCheckout() {
    waitForCondition().until(
        ExpectedConditions.visibilityOfElementLocated(CartShippingPage.PROCCED_TO_CHECKOUT_BUTTON))
        .click();
  }
}
