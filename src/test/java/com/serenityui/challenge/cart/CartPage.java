package com.serenityui.challenge.cart;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

class CartPage extends PageObject {

  static final By PROCEED_TO_CHECKOUT_BUTTON = By
      .xpath("//*[@id='layer_cart']//a[@class and @title='Proceed to checkout']");
  static final By CONTINUE_SHOPPING_BUTTON = By
      .xpath("//*[@id='layer_cart']//span[@title='Continue shopping']");

}
