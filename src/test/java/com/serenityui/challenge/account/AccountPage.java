package com.serenityui.challenge.account;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

class AccountPage extends PageObject {

  static final By EMAIL_FIELD = By.id("email_create");
  static final By CREATE_ACC_BUTTON = By.id("SubmitCreate");
  static final By ACCOUNT_PAGE_HEADING = By.cssSelector("h1");
  static final By ACCOUNT_INFO_TEXT = By.className("info-account");
}
