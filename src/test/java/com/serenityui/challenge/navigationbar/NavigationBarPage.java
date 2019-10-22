package com.serenityui.challenge.navigationbar;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class NavigationBarPage extends PageObject {

  static final By SIGN_IN_LINK = By.cssSelector(".login");
  static final By ACCOUNT_USER_NAME = By.className("account");
  static final By LOGOUT_LINK = By.className("logout");
}
