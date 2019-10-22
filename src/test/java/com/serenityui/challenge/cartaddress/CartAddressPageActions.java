package com.serenityui.challenge.cartaddress;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartAddressPageActions extends UIInteractionSteps {

  @Step("Proceed to checkout from address page")
  public void proceedToCheckout() {
    waitForCondition().until(
        ExpectedConditions.visibilityOfElementLocated(CartAddressPage.PROCEED_TO_CHECKOUT_BUTTON))
        .click();
  }
}
