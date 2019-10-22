package com.serenityui.challenge.cartpayment;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPaymentPageActions extends UIInteractionSteps {

  @Step
  public void payByBankWire() {
    waitForCondition().until(
        ExpectedConditions.visibilityOfElementLocated(CartPaymentPage.PAY_BY_WIRE_LINK))
        .click();
  }

  @Step
  public void confirmOrder() {
    waitForCondition().until(
        ExpectedConditions.visibilityOfElementLocated(CartPaymentPage.CONFIRM_ORDER_BUTTON))
        .click();
  }
}
