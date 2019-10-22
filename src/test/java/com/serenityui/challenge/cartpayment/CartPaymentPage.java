package com.serenityui.challenge.cartpayment;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

class CartPaymentPage extends PageObject {

  static final By PAY_BY_WIRE_LINK = By.className("bankwire");
  static final By CONFIRM_ORDER_BUTTON = By.xpath("//*[@id='cart_navigation']/button");
  static final By PAGE_HEADING = By.cssSelector("h1");
  static final By CONFIRMATION_MESSAGE = By.xpath("//*[@class='cheque-indent']/strong");
  static final By SHIPPING_STEP_COMPLETED = By
      .xpath("//li[@class='step_done step_done_last four']");
  static final By LAST_STEP = By
      .xpath("//li[@id='step_end' and @class='step_current last']");
}
