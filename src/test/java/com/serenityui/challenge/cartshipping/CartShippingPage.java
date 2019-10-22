package com.serenityui.challenge.cartshipping;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

class CartShippingPage extends PageObject {

  static final By PROCCED_TO_CHECKOUT_BUTTON = By.name("processCarrier");
  static final By TERMS_CHECKBOX = By.id("uniform-cgv");
}
