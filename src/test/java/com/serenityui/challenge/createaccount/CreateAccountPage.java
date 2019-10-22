package com.serenityui.challenge.createaccount;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

class CreateAccountPage extends PageObject {

  static final By TITLE_FEMALE = By.id("id_gender2");
  static final By ACC_CREATION_FORM = By.id("account-creation_form");
  static final By FIRST_NAME_FIELD = By.id("customer_firstname");
  static final By LAST_NAME_FIELD = By.id("customer_lastname");
  static final By PASSWORD_FIELD = By.id("passwd");
  static final By BIRTH_DAY = By.id("days");
  static final By BIRTH_MONTH = By.id("months");
  static final By BIRTH_YEAR = By.id("years");
  static final By COMPANY_FIELD = By.id("company");
  static final By ADDRESS1_FIELD = By.id("address1");
  static final By ADDRESS2_FIELD = By.id("address2");
  static final By CITY_FIELD = By.id("city");
  static final By STATE_FIELD = By.id("id_state");
  static final By ZIP_CODE_FIELD = By.id("postcode");
  static final By OTHER_INFO_FIELD = By.id("other");
  static final By HOME_PH_FIELD = By.id("phone");
  static final By MOBILE_PH_FIELD = By.id("phone_mobile");
  static final By ALIAS_FIELD = By.id("alias");
  static final By REGISTER_BUTTON = By.id("submitAccount");
}
