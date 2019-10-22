package com.serenityui.challenge.signin;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:signin.page")
public class SignInPage extends PageObject {

  static final By SIGN_IN_BUTTON = By.id("SubmitLogin");
  static final By EMAIL_FIELD = By.id("email");
  static final By PASSWORD_FIELD = By.id("passwd");

}
