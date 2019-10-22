package com.serenityui.challenge.cart;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPopUpActions extends UIInteractionSteps {

  @Step
  public void continueShopping() {
    waitForCondition().until(
        ExpectedConditions.visibilityOfElementLocated(CartPage.CONTINUE_SHOPPING_BUTTON))
        .click();
  }

  @Step("Proceed to checkout from product page")
  public void proceedToCheckout() {
    waitForCondition().until(
        ExpectedConditions.visibilityOfElementLocated(CartPage.PROCEED_TO_CHECKOUT_BUTTON))
        .click();
  }
}
