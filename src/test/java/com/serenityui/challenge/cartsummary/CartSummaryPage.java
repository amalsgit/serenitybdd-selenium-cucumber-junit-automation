package com.serenityui.challenge.cartsummary;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

class CartSummaryPage extends PageObject {

  static final By PROCCED_TO_CHECKOUT_BUTTON = By
      .xpath("//*[contains(@class,'cart_navigation')]/a[@title='Proceed to checkout']");
}
