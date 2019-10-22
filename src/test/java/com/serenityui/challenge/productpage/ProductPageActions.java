package com.serenityui.challenge.productpage;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPageActions extends UIInteractionSteps {

  @Step
  public void addItemToCart() {
    waitForCondition().until(
        ExpectedConditions.visibilityOfElementLocated(ProductPage.ADD_ITEM_TO_CART_BUTTON))
        .click();
  }
}
