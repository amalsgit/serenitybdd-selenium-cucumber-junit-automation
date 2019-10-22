package com.serenityui.challenge.cartsummary;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartSummaryPageActions extends UIInteractionSteps {

  @Step("Proceed to checkout from summary page")
  public void proceedToCheckout() {
    waitForCondition().until(
        ExpectedConditions.visibilityOfElementLocated(CartSummaryPage.PROCCED_TO_CHECKOUT_BUTTON))
        .click();
  }
}
